package com.munamu.munamuinventory.inventory.appication.usecase.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearPrendaRequest;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;

import java.util.List;

public interface PrendaUseCase {
    String addPrenda(CrearPrendaRequest prendaRequest);
    List<Prenda> getPrendas();
}
