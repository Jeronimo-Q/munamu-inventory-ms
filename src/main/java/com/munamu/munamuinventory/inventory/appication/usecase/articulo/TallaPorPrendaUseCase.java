package com.munamu.munamuinventory.inventory.appication.usecase.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearTallaPorPrendaRequest;

import java.util.List;

public interface TallaPorPrendaUseCase {
    public String addTallasPorPrenda(List<CrearTallaPorPrendaRequest> prendas);
}
