package com.munamu.munamuinventory.inventory.infrastructure.controller.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearTallaPorPrendaRequest;
import com.munamu.munamuinventory.inventory.appication.service.articulo.TallaPorPrendaUseCase;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1/rest//inventory/prendas/configuracion")
public class TallaPorPrendaController {

    private final TallaPorPrendaUseCase tallaPorPrendaUseCase;

    public TallaPorPrendaController(TallaPorPrendaUseCase tallaPorPrendaUseCase) {
        this.tallaPorPrendaUseCase = tallaPorPrendaUseCase;
    }

    @PostMapping
    public ResponseEntity<String> addPrendas(@Valid @RequestBody List<CrearTallaPorPrendaRequest> prendas) {

        String mensaje = tallaPorPrendaUseCase.addTallasPorPrenda(prendas);

        return ResponseEntity.ok().body(mensaje);

    }

    @GetMapping("/get-by-prenda/{prendaId}")
    public ResponseEntity<List<TallaPorPrenda>> getPrendas(@PathVariable String prendaId) {

        List<TallaPorPrenda> tallaPorPrendas = tallaPorPrendaUseCase.getTallaPorPrendasPerPrendaId(prendaId);

        return ResponseEntity.ok().body(tallaPorPrendas);
    }

}
