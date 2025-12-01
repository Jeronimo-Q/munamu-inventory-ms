package com.munamu.munamuinventory.inventory.appication.service.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.CrearPrendaRequest;
import com.munamu.munamuinventory.inventory.appication.mapper.PrendaMapperDto;
import com.munamu.munamuinventory.inventory.appication.usecase.articulo.PrendaUseCase;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.EstadoPrenda;
import com.munamu.munamuinventory.inventory.infrastructure.adapters.articulo.PrendaJpaAdapter;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PrendaService implements PrendaUseCase {

    private final PrendaJpaAdapter prendaJpaAdapter;
    private final PrendaMapperDto prendaMapperDto;

    public PrendaService(PrendaJpaAdapter prendaJpaAdapter, PrendaMapperDto prendaMapperDto) {
        this.prendaJpaAdapter = prendaJpaAdapter;
        this.prendaMapperDto = prendaMapperDto;
    }

    @Override
    public String addPrenda(CrearPrendaRequest prendaRequest) {
        try{
            if (prendaJpaAdapter.existsByReferencia(prendaRequest.getReferencia())){
                throw new RuntimeException("Referencia ya existe existe");
            }
            var prendaDomain = prendaMapperDto.toDomain(prendaRequest);
            prendaDomain.setEstadoPrenda(EstadoPrenda.ACTIVA);
            return prendaJpaAdapter.save(prendaDomain);
        }
        catch (Exception e) {
            throw new RuntimeException("Error adding prenda");
        }
    }

    @Override
    public List<Prenda> getPrendas() {
        return List.of();
    }
}
