package com.munamu.munamuinventory.inventory.infrastructure.adapters.remision;

import com.munamu.munamuinventory.inventory.domain.domain.remision.RemisionCorte;
import com.munamu.munamuinventory.inventory.domain.repository.remision.RemisionCorteRepository;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.remision.RemisionCorteEntity;
import com.munamu.munamuinventory.inventory.infrastructure.exception.DatabaseException;
import com.munamu.munamuinventory.inventory.infrastructure.mapper.remision.RemisionCorteMapperEntity;
import com.munamu.munamuinventory.inventory.infrastructure.repository.remision.RemisionCorteRepositoryJpa;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class RemisionCorteJpaAdapter implements RemisionCorteRepository {

    private final RemisionCorteRepositoryJpa remisionCorteRepositoryJpa;
    private final RemisionCorteMapperEntity remisionCorteMapperEntity;

    public RemisionCorteJpaAdapter(RemisionCorteRepositoryJpa remisionCorteRepositoryJpa, RemisionCorteMapperEntity remisionCorteMapperEntity) {
        this.remisionCorteRepositoryJpa = remisionCorteRepositoryJpa;
        this.remisionCorteMapperEntity = remisionCorteMapperEntity;
    }

    @Override
    public void save(RemisionCorte remisionCorte) {
        try{
            RemisionCorteEntity remisionCorteEntity = remisionCorteMapperEntity.toEntity(remisionCorte);
            remisionCorteRepositoryJpa.save(remisionCorteEntity);
        }
        catch (DataAccessException e) {
            throw new DatabaseException("Error al guardar la remision de corte ",e);
        }
    }
}
