package com.munamu.munamuinventory.inventory.infrastructure.repository.remision;

import com.munamu.munamuinventory.inventory.infrastructure.entiy.remision.RemisionCorteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RemisionCorteRepositoryJpa extends JpaRepository<RemisionCorteEntity, UUID> {

}
