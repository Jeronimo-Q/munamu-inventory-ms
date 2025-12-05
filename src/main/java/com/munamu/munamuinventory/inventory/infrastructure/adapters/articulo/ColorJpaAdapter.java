package com.munamu.munamuinventory.inventory.infrastructure.adapters.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.Color;
import com.munamu.munamuinventory.inventory.domain.repository.articulo.ColorRepository;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.ColorEntity;
import com.munamu.munamuinventory.inventory.infrastructure.exception.DatabaseException;
import com.munamu.munamuinventory.inventory.infrastructure.mapper.articulo.ColorMapperEntity;
import com.munamu.munamuinventory.inventory.infrastructure.repository.articulo.ColorRepositoryJpa;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class ColorJpaAdapter implements ColorRepository {

    private final ColorRepositoryJpa colorRepositoryJpa;
    private final ColorMapperEntity colorMapperEntity;

    public ColorJpaAdapter(ColorRepositoryJpa colorRepositoryJpa, ColorMapperEntity colorMapperEntity) {
        this.colorRepositoryJpa = colorRepositoryJpa;
        this.colorMapperEntity = colorMapperEntity;
    }

    @Override
    public Color getColor(String id) {
        try {
            Optional<ColorEntity> colorEntity = colorRepositoryJpa.findById(UUID.fromString(id));
            return colorMapperEntity.toDomain(colorEntity.get());
        }catch (DataAccessException e) {
            throw new DatabaseException("Error al consultar el color ",e);
        }

    }

    @Override
    public boolean existsColor(String id) {
        try {
            return colorRepositoryJpa.existsById(UUID.fromString(id));
        }catch (DataAccessException e) {
            throw new DatabaseException("Error al consultar el color ",e);
        }
    }

    @Override
    public void addColor(Color color) {
        try {
            ColorEntity colorEntity = colorMapperEntity.toEntity(color);
            colorRepositoryJpa.save(colorEntity);
        }catch (DataAccessException e) {
            throw new DatabaseException("Error al añadir un nuevo color ",e);
        }
    }
}
