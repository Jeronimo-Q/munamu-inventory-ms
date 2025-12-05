package com.munamu.munamuinventory.inventory.domain.repository.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Talla;

import java.util.List;

public interface TallaPorPrendaRepository {

    void saveTallaPorPrenda(TallaPorPrenda tallaPorPrenda);

    List<TallaPorPrenda> findAllTallaPorPrendaPerPrenda(String prendaId);

    boolean existsByCodigoBarra(long codigoBarra);

    boolean existsByTallaAndPrendaAndColor(Talla talla, String prendaId, String colorId);

}
