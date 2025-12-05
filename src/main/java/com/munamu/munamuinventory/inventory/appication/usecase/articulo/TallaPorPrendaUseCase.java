package com.munamu.munamuinventory.inventory.appication.usecase.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearTallaPorPrendaRequest;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;

import java.util.List;

public interface TallaPorPrendaUseCase {
    String addTallasPorPrenda(List<CrearTallaPorPrendaRequest> prendas);
    List<TallaPorPrenda> getTallaPorPrendasPerPrendaId(String prendaId);
}
