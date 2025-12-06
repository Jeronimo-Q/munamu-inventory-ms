package com.munamu.munamuinventory.inventory.infrastructure.controller.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearPrendaRequest;
import com.munamu.munamuinventory.inventory.appication.service.articulo.PrendaUseCase;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1/rest/inventory/prenda")
public class PrendaController {

    private final PrendaUseCase prendaUseCase;

    public PrendaController(PrendaUseCase prendaUseCase) {
        this.prendaUseCase = prendaUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Prenda>> getPrenda() {
        List<Prenda> prendas = prendaUseCase.getPrendas();

        return ResponseEntity.status(HttpStatus.OK).body(prendas);
    }

    @PostMapping
    public ResponseEntity<String> addPrenda(@Valid @RequestBody CrearPrendaRequest prendaRequest) {

        String mensaje = prendaUseCase.addPrenda(prendaRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(mensaje);
    }


}
