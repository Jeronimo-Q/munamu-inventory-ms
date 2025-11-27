package com.munamu.munamuinventory.inventory.infrastructure.controller;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1/rest/prenda")
public class PrendaController {

    @GetMapping("")
    public List<Prenda> getPrenda() {
        return null;
    }

    @PostMapping
    public Prenda addPrenda(@RequestBody Prenda prenda) {
        return null;
    }
}
