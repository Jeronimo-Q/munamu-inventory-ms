package com.munamu.munamuinventory.inventory.appication.mapper.remision;

import com.munamu.munamuinventory.inventory.appication.dto.request.remision.CrearDetalleRemisionCorteRequest;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.remision.DetalleRemisionCorte;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DetalleRemisionCorteMapperDto {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "remisionCorte", ignore = true)
    @Mapping(target = "tallaPorPrenda", source = "tallaPorPrenda", qualifiedByName = "toTallaPorPrenda")
    DetalleRemisionCorte toDomian(CrearDetalleRemisionCorteRequest request);

    List<DetalleRemisionCorte> toDomainList(List<CrearDetalleRemisionCorteRequest> list);

    @Named("toTallaPorPrenda")
    default TallaPorPrenda toTallaPorPrenda(String talla) {
        if (talla == null) return null;
        TallaPorPrenda t = new TallaPorPrenda();
        t.setId(talla);
        return t;
    }

}
