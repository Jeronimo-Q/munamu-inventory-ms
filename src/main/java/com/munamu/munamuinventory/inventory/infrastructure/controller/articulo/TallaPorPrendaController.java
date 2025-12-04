package com.munamu.munamuinventory.inventory.infrastructure.controller.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearTallaPorPrendaRequest;
import com.munamu.munamuinventory.inventory.appication.service.articulo.TallaPorPrendaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/api/v1/rest/prendas/configuracion")
public class TallaPorPrendaController {

    private final TallaPorPrendaService tallaPorPrendaService;

    public TallaPorPrendaController(TallaPorPrendaService tallaPorPrendaService) {
        this.tallaPorPrendaService = tallaPorPrendaService;
    }

    @PostMapping
    public ResponseEntity<String> addPrendas(@Valid @RequestBody List<CrearTallaPorPrendaRequest> prendas) {

        String mensaje = tallaPorPrendaService.addTallasPorPrenda(prendas);

        return ResponseEntity.ok().body(mensaje);

    }

}
