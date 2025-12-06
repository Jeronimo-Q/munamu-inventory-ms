package com.munamu.munamuinventory.inventory.infrastructure.mapper.remision;

import com.munamu.munamuinventory.inventory.domain.domain.remision.DetalleRemisionCorte;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.remision.DetalleRemisionCorteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DetalleRemisionCorteMapperEntity {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "remisionCorte", ignore = true)
    DetalleRemisionCorteEntity toEntity(DetalleRemisionCorte request);

    List<DetalleRemisionCorteEntity> toEntityList(List<DetalleRemisionCorte> list);

}
