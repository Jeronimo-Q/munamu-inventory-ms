package com.munamu.munamuinventory.inventory.infrastructure.mapper.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.TallaPorPrendaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TallaPoPrendaMapperEntity {

    TallaPorPrenda toDomain (TallaPorPrendaEntity entity);

    TallaPorPrendaEntity toEntity (TallaPorPrenda domain);
}
