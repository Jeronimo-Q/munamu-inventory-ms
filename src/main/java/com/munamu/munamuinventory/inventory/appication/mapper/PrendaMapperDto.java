package com.munamu.munamuinventory.inventory.appication.mapper;

import com.munamu.munamuinventory.inventory.appication.dto.request.CrearPrendaRequest;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.EstadoPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Genero;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.TipoPrenda;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface PrendaMapperDto {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "genero", source = "genero", qualifiedByName = "mapGenero")
    @Mapping(target = "tipoPrenda", source = "tipoPrenda", qualifiedByName = "mapTipoPrenda")
    @Mapping(target = "estadoPrenda", ignore = true)
    Prenda toDomain(CrearPrendaRequest request);

    @Named("mapGenero")
    default Genero mapGenero(String genero) {
        return genero != null ? Genero.valueOf(genero.toUpperCase()) : null;
    }

    @Named("mapTipoPrenda")
    default TipoPrenda mapTipoPrenda(String tipo) {
        return tipo != null ? TipoPrenda.valueOf(tipo.toUpperCase()) : null;
    }

}
