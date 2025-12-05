package com.munamu.munamuinventory.inventory.infrastructure.controller.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearTallaPorPrendaRequest;
import com.munamu.munamuinventory.inventory.appication.service.articulo.TallaPorPrendaService;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1/rest//inventory/prendas/configuracion")
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

    @GetMapping("/get-by-prenda/{prendaId}")
    public ResponseEntity<List<TallaPorPrenda>> getPrendas(@PathVariable String prendaId) {

        List<TallaPorPrenda> tallaPorPrendas = tallaPorPrendaService.getTallaPorPrendasPerPrendaId(prendaId);

        return ResponseEntity.ok().body(tallaPorPrendas);
    }

}
