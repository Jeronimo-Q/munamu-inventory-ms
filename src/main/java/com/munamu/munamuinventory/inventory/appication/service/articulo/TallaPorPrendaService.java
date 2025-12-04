package com.munamu.munamuinventory.inventory.appication.service.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearTallaPorPrendaRequest;
import com.munamu.munamuinventory.inventory.appication.mapper.articulo.TallPorPrendaMapperDto;
import com.munamu.munamuinventory.inventory.appication.usecase.articulo.TallaPorPrendaUseCase;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Talla;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.rule.EnumValidator;
import com.munamu.munamuinventory.inventory.infrastructure.adapters.articulo.TallaPoPrendaAdapter;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TallaPorPrendaService implements TallaPorPrendaUseCase {

    private final TallaPoPrendaAdapter tallaPoPrendaAdapter;
    private final TallPorPrendaMapperDto tallPorPrendaMapperDto;

    public TallaPorPrendaService(TallaPoPrendaAdapter tallaPoPrendaAdapter, TallPorPrendaMapperDto tallPorPrendaMapperDto) {
        this.tallaPoPrendaAdapter = tallaPoPrendaAdapter;
        this.tallPorPrendaMapperDto = tallPorPrendaMapperDto;
    }


    @Override
    public String addTallasPorPrenda(List<CrearTallaPorPrendaRequest> prendas) {
        for (CrearTallaPorPrendaRequest prenda : prendas){
            TallaPorPrenda tallaPorPrenda = tallPorPrendaMapperDto.toDomain(prenda);
            EnumValidator.enumValidator(Talla.class,tallaPorPrenda.getTalla().toString(),"talla");

            tallaPoPrendaAdapter.saveTallaPorPrenda(tallaPorPrenda);

        }

        return "";
    }
}
