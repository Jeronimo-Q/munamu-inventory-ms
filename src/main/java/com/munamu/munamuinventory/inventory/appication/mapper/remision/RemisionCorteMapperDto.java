package com.munamu.munamuinventory.inventory.appication.mapper.remision;

import com.munamu.munamuinventory.inventory.appication.dto.request.remision.CrearRemisionCorteRequest;
import com.munamu.munamuinventory.inventory.domain.domain.remision.RemisionCorte;
import com.munamu.munamuinventory.inventory.domain.domain.remision.TallerConfeccion;
import com.munamu.munamuinventory.inventory.domain.domain.remision.enums.EstadoRemision;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {DetalleRemisionCorteMapperDto.class})
public interface RemisionCorteMapperDto {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "estadoRemision", source = "estadoRemision", qualifiedByName = "mapEstadoRemision")
    @Mapping(target = "tallerConfeccion", source = "tallerConfeccion", qualifiedByName = "toTallerConfeccion")
    RemisionCorte toDomain(CrearRemisionCorteRequest request);

    @AfterMapping
    default void setRemisionInDetalles(@MappingTarget RemisionCorte remision) {
        if (remision.getDetalleRemisionCortes() != null) {
            remision.getDetalleRemisionCortes()
                    .forEach(detalle -> detalle.setRemisionCorte(remision));
        }
    }

    @Named("toTallerConfeccion")
    default TallerConfeccion toTallerConfeccion(String id) {
        if (id == null) return null;
        TallerConfeccion tallerConfeccion = new TallerConfeccion();
        tallerConfeccion.setId(id);
        return tallerConfeccion;
    }

    @Named("mapEstadoRemision")
    default EstadoRemision mapEstadoRemision(String estadoRemision) {
        return estadoRemision != null ? EstadoRemision.valueOf(estadoRemision.toUpperCase()) : null;
    }

}
