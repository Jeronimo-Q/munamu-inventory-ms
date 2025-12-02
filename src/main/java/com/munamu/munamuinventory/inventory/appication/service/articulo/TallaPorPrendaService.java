package com.munamu.munamuinventory.inventory.appication.service.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearTallaPorPrendaRequest;
import com.munamu.munamuinventory.inventory.appication.usecase.articulo.TallaPorPrendaUseCase;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Talla;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.rule.EnumValidator;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TallaPorPrendaService implements TallaPorPrendaUseCase {


    @Override
    public String addTallasPorPrenda(List<CrearTallaPorPrendaRequest> prendas) {
        for (CrearTallaPorPrendaRequest prenda : prendas){
            EnumValidator.enumValidator(Talla.class,prenda.getTallas().toString(),"talla");

        }

        return "";
    }
}
