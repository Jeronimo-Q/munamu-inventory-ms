package com.munamu.munamuinventory.inventory.appication.service.articulo;

import com.munamu.munamuinventory.inventory.appication.dto.request.articulo.CrearTallaPorPrendaRequest;
import com.munamu.munamuinventory.inventory.appication.mapper.articulo.TallaPorPrendaMapperDto;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Talla;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.rule.EnumValidator;
import com.munamu.munamuinventory.inventory.domain.exception.DomainException;
import com.munamu.munamuinventory.inventory.infrastructure.adapters.articulo.ColorJpaAdapter;
import com.munamu.munamuinventory.inventory.infrastructure.adapters.articulo.PrendaJpaAdapter;
import com.munamu.munamuinventory.inventory.infrastructure.adapters.articulo.TallaPorPrendaJpaAdapter;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TallaPorPrendaUseCase implements com.munamu.munamuinventory.inventory.appication.usecase.articulo.TallaPorPrendaUseCase {

    private final TallaPorPrendaJpaAdapter tallaPorPrendaJpaAdapter;
    private final TallaPorPrendaMapperDto tallaPorPrendaMapperDto;
    private final PrendaJpaAdapter prendaJpaAdapter;
    private final ColorJpaAdapter colorJpaAdapter;

    public TallaPorPrendaUseCase(TallaPorPrendaJpaAdapter tallaPorPrendaJpaAdapter, TallaPorPrendaMapperDto tallaPorPrendaMapperDto, PrendaJpaAdapter prendaJpaAdapter, ColorJpaAdapter colorJpaAdapter) {
        this.tallaPorPrendaJpaAdapter = tallaPorPrendaJpaAdapter;
        this.tallaPorPrendaMapperDto = tallaPorPrendaMapperDto;
        this.prendaJpaAdapter = prendaJpaAdapter;
        this.colorJpaAdapter = colorJpaAdapter;
    }


    @Override
    public String addTallasPorPrenda(List<CrearTallaPorPrendaRequest> prendas) {
        for (CrearTallaPorPrendaRequest prenda : prendas){
            TallaPorPrenda tallaPorPrenda = tallaPorPrendaMapperDto.toDomain(prenda);
            EnumValidator.enumValidator(Talla.class,tallaPorPrenda.getTalla().toString(),"talla");

            if(tallaPorPrendaJpaAdapter.existsByCodigoBarra(tallaPorPrenda.getCodigoBarra())){
                throw new DomainException("El codigo de barra ya existe");
            }

            if(!prendaJpaAdapter.existsById(tallaPorPrenda.getPrenda().getId())){
                throw new DomainException("La Prenda no existe");
            }

            if(!colorJpaAdapter.existsColor(tallaPorPrenda.getColor().getId())){
                throw new DomainException("El Color no existe");
            }

            if (tallaPorPrendaJpaAdapter.existsByTallaAndPrendaAndColor(tallaPorPrenda.getTalla(),tallaPorPrenda.getPrenda().getId(),tallaPorPrenda.getColor().getId())){
                throw new DomainException("El prenda con la configuracion talla, prenda y color ya existe en el sistema");
            }

            tallaPorPrendaJpaAdapter.saveTallaPorPrenda(tallaPorPrenda);

        }

        return "Talla por prenda guardada correctamente";
    }

    @Override
    public List<TallaPorPrenda> getTallaPorPrendasPerPrendaId(String prendaId) {
        if(!prendaJpaAdapter.existsById(prendaId)){
            throw new DomainException("La prenda no existe");
        }

        return tallaPorPrendaJpaAdapter.findAllTallaPorPrendaPerPrenda(prendaId);
    }
}
