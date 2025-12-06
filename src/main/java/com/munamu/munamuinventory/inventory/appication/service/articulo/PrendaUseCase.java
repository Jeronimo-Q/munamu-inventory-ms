package com.munamu.munamuinventory.inventory.appication.service.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearPrendaRequest;
import com.munamu.munamuinventory.inventory.appication.mapper.articulo.PrendaMapperDto;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.EstadoPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Genero;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.TipoPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.rule.EnumValidator;
import com.munamu.munamuinventory.inventory.domain.exception.ReferenciaDuplicadaException;
import com.munamu.munamuinventory.inventory.infrastructure.adapters.articulo.PrendaJpaAdapter;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PrendaUseCase implements com.munamu.munamuinventory.inventory.appication.usecase.articulo.PrendaUseCase {

    private final PrendaJpaAdapter prendaJpaAdapter;
    private final PrendaMapperDto prendaMapperDto;

    public PrendaUseCase(PrendaJpaAdapter prendaJpaAdapter, PrendaMapperDto prendaMapperDto) {
        this.prendaJpaAdapter = prendaJpaAdapter;
        this.prendaMapperDto = prendaMapperDto;
    }

    @Override
    public String addPrenda(CrearPrendaRequest prendaRequest) {
        var prendaDomain = prendaMapperDto.toDomain(prendaRequest);

        EnumValidator.enumValidator(Genero.class,prendaDomain.getGenero().toString(), "genero");
        EnumValidator.enumValidator(TipoPrenda.class,prendaDomain.getTipoPrenda().toString(), "tipo prenda");

        if (prendaJpaAdapter.existsByReferencia(prendaRequest.getReferencia())){
            throw new ReferenciaDuplicadaException(prendaRequest.getReferencia());
        }
        prendaDomain.setEstadoPrenda(EstadoPrenda.ACTIVA);

        prendaJpaAdapter.save(prendaDomain);

        return "Se guardo de manera exitosa la prenda";

    }

    @Override
    public List<Prenda> getPrendas() {
        return prendaJpaAdapter.findAll();
    }
}
