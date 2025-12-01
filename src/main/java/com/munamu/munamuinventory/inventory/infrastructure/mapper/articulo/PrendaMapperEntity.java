package com.munamu.munamuinventory.inventory.infrastructure.mapper.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.PrendaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface PrendaMapperEntity {

    Prenda toDomain(PrendaEntity entity);

    List<Prenda> toDomain(List<PrendaEntity> entities);

    @Mapping(target = "id", ignore = true)
    PrendaEntity toEntity(Prenda domain);
}

