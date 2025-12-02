package com.munamu.munamuinventory.inventory.infrastructure.controller;

import com.munamu.munamuinventory.inventory.appication.exception.ApplicationException;
import com.munamu.munamuinventory.inventory.domain.exception.DomainException;
import com.munamu.munamuinventory.inventory.infrastructure.exception.InfrastructureException;
import com.munamu.munamuinventory.inventory.util.expception.ApiError;
import com.munamu.munamuinventory.inventory.util.expception.ErrorCodeGenerator;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /** DOMAIN ERRORS */
    @ExceptionHandler(DomainException.class)
    public ResponseEntity<ApiError> handleDomain(DomainException ex, HttpServletRequest req) {

        String code = ErrorCodeGenerator.generate();
        log.error("[{}] Domain error: {}", code, ex.getMessage(), ex);

        ApiError error = new ApiError(code, 400, ex.getMessage(), req.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }

    /** APPLICATION ERRORS */
    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<ApiError> handleApplication(ApplicationException ex, HttpServletRequest req) {

        String code = ErrorCodeGenerator.generate();
        log.error("[{}] Application error: {}", code, ex.getMessage(), ex);

        ApiError error = new ApiError(code, 500, ex.getMessage(), req.getRequestURI());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

    /** INFRASTRUCTURE ERRORS */
    @ExceptionHandler(InfrastructureException.class)
    public ResponseEntity<ApiError> handleInfra(InfrastructureException ex, HttpServletRequest req) {

        String code = ErrorCodeGenerator.generate();
        log.error("[{}] Infrastructure error: {}", code, ex.getMessage(), ex);

        ApiError error = new ApiError(code, 502, "Error de infraestructura", req.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(error);
    }

    /** VALIDATION ERRORS */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleValidation(MethodArgumentNotValidException ex, HttpServletRequest req) {

        String code = ErrorCodeGenerator.generate();

        String msg = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(err -> err.getField() + ": " + err.getDefaultMessage())
                .findFirst()
                .orElse("Datos inválidos");

        log.warn("[{}] Validation error: {}", code, msg);

        ApiError error = new ApiError(code, 400, msg, req.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }

    /** UNEXPECTED ERRORS */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleUnexpected(Exception ex, HttpServletRequest req) {

        String code = ErrorCodeGenerator.generate();
        log.error("[{}] Unexpected error", code, ex);

        ApiError error = new ApiError(code, 500, "Error interno del servidor", req.getRequestURI());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
    }

}
