package com.munamu.munamuinventory.inventory.infrastructure.mapper.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.TallaPorPrendaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TallaPoPrendaMapperEntity {

    TallaPorPrenda toDomain (TallaPorPrendaEntity entity);

    List<TallaPorPrenda>toDomain (List<TallaPorPrendaEntity> entities);

    TallaPorPrendaEntity toEntity (TallaPorPrenda domain);

}
