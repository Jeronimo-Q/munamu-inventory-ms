package com.munamu.munamuinventory.inventory.infrastructure.repository.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Talla;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.TallaPorPrendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TallaPorPrendaJpa extends JpaRepository<TallaPorPrendaEntity, UUID> {

    boolean existsByCodigoBarra(long codigoBarra);

    boolean existsByTallaAndPrenda_IdAndColor_Id(Talla talla, UUID prendaId, UUID colorId);

    List<TallaPorPrendaEntity> findAllByPrenda_id(UUID prendaId);
}
