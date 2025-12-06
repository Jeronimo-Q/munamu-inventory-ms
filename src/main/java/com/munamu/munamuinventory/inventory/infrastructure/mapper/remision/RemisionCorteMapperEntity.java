package com.munamu.munamuinventory.inventory.infrastructure.mapper.remision;

import com.munamu.munamuinventory.inventory.domain.domain.remision.RemisionCorte;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.remision.RemisionCorteEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DetalleRemisionCorteMapperEntity.class})
public interface RemisionCorteMapperEntity {


    RemisionCorte toEntity(RemisionCorteEntity entity);

    List<RemisionCorte> toEntity(List<RemisionCorteEntity> entities);

    @Mapping(target = "id", ignore = true)
    RemisionCorteEntity toEntity(RemisionCorte domain);

    @AfterMapping
    default void linkDetalles(@MappingTarget RemisionCorteEntity entity) {
        if (entity.getDetalleRemisionCortes() != null) {
            entity.getDetalleRemisionCortes().forEach(d -> d.setRemisionCorte(entity));
        }
    }
}
