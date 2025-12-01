package com.munamu.munamuinventory.inventory.infrastructure.repository.articulo;

import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.PrendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrendaRepositoryJpa extends JpaRepository<PrendaEntity, UUID> {

    PrendaEntity findByReferencia(int referencia);
    boolean existsByReferencia(int referencia);

}
