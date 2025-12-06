package com.munamu.munamuinventory.inventory.infrastructure.controller.remision;

import com.munamu.munamuinventory.inventory.appication.dto.request.remision.CrearRemisionCorteRequest;
import com.munamu.munamuinventory.inventory.appication.usecase.remision.RemisionCorteUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/v1/rest/inventory/remision/corte")
public class RemisionCorteController {

    private final RemisionCorteUseCase remisionCorteUseCase;

    public RemisionCorteController(RemisionCorteUseCase remisionCorteUseCase) {
        this.remisionCorteUseCase = remisionCorteUseCase;
    }

    @PostMapping
    public ResponseEntity<String> crearRemisionCorte(@RequestBody CrearRemisionCorteRequest remisionCorte) {

        String mensaje = remisionCorteUseCase.addRemisionCorte(remisionCorte);

        return ResponseEntity.status(HttpStatus.CREATED).body(mensaje);
    }


}
