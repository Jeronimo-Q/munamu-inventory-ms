package com.munamu.munamuinventory.inventory.infrastructure.mapper.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.Color;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.ColorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ColorMapperEntity {

    Color toDomain(ColorEntity entity);

    List<Color> toDomain(List<ColorEntity> entities);

    @Mapping(target = "id", ignore = true)
    ColorEntity toEntity(Color domain);

}
