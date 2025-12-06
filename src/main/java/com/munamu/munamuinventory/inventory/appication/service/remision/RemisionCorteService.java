package com.munamu.munamuinventory.inventory.appication.service.remision;

import com.munamu.munamuinventory.inventory.appication.dto.request.remision.CrearRemisionCorteRequest;
import com.munamu.munamuinventory.inventory.appication.mapper.remision.RemisionCorteMapperDto;
import com.munamu.munamuinventory.inventory.appication.usecase.remision.RemisionCorteUseCase;
import com.munamu.munamuinventory.inventory.domain.domain.remision.RemisionCorte;
import com.munamu.munamuinventory.inventory.infrastructure.adapters.remision.RemisionCorteJpaAdapter;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RemisionCorteService implements RemisionCorteUseCase {

    private final RemisionCorteMapperDto remisionCorteMapperDto;
    private final RemisionCorteJpaAdapter remisionCorteJpaAdapter;

    public RemisionCorteService(RemisionCorteMapperDto remisionCorteMapperDto, RemisionCorteJpaAdapter remisionCorteJpaAdapter) {
        this.remisionCorteMapperDto = remisionCorteMapperDto;
        this.remisionCorteJpaAdapter = remisionCorteJpaAdapter;
    }

    @Override
    public String addRemisionCorte(CrearRemisionCorteRequest corte) {
        RemisionCorte remisionCorte = remisionCorteMapperDto.toDomain(corte);
        remisionCorteJpaAdapter.save(remisionCorte);

        return "Se registro de manera erxistosa la remision corte ";
    }
}
