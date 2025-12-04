package com.munamu.munamuinventory.inventory.infrastructure.repository.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.TallaPorPrendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TallaPorPrendaJpa extends JpaRepository<TallaPorPrendaEntity, UUID> {
}
