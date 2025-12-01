package com.munamu.munamuinventory.inventory.infrastructure.controller.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.CrearPrendaRequest;
import com.munamu.munamuinventory.inventory.appication.service.articulo.PrendaService;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1/rest/prenda")
public class PrendaController {

    private final PrendaService prendaService;

    public PrendaController(PrendaService prendaService) {
        this.prendaService = prendaService;
    }

    @GetMapping
    public List<Prenda> getPrenda() {
        return null;
    }

    @PostMapping
    public Prenda addPrenda(@Valid @RequestBody CrearPrendaRequest prendaRequest) {

        prendaService.addPrenda(prendaRequest);

        return null;
    }
}
