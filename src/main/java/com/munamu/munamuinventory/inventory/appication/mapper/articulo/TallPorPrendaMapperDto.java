package com.munamu.munamuinventory.inventory.appication.mapper.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearTallaPorPrendaRequest;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.Color;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Talla;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface TallPorPrendaMapperDto {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "talla", source = "talla", qualifiedByName = "mapTalla")
    @Mapping(target = "codigoBarra", expression = "java( Long.parseLong(request.getCodigoBarra()) )")
    @Mapping(target = "prenda", expression = "java( toPrenda(request.getIdPrenda()) )")
    @Mapping(target = "color", expression = "java( toColor(request.getColor()) )")
    TallaPorPrenda toDomain(CrearTallaPorPrendaRequest request);

    default Prenda toPrenda(String id) {
        if (id == null) return null;
        Prenda prenda = new Prenda();
        prenda.setId(id);
        return prenda;
    }

    default Color toColor(String id) {
        if (id == null) return null;
        Color color = new Color();
        color.setId(id);
        return color;
    }

    @Named("mapTalla")
    default Talla mapTalla(String talla) {
        return talla != null ? Talla.valueOf(talla.toUpperCase()) : null;
    }
}
