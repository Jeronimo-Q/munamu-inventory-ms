package com.munamu.munamuinventory.inventory.infrastructure.repository.articulo;

import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.ColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ColorRepositoryJpa extends JpaRepository<ColorEntity, UUID> {

}
