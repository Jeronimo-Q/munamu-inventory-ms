package com.munamu.munamuinventory.inventory.domain.repository.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;

import java.util.List;

public interface TallaPorPrendaRepository {

    void saveTallaPorPrenda(TallaPorPrenda tallaPorPrenda);

    List<TallaPorPrenda> findAllTallaPorPrenda();

}
