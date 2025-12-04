package com.munamu.munamuinventory.inventory.infrastructure.adapters.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.domain.repository.articulo.TallaPorPrendaRepository;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.PrendaEntity;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.TallaPorPrendaEntity;
import com.munamu.munamuinventory.inventory.infrastructure.exception.DatabaseException;
import com.munamu.munamuinventory.inventory.infrastructure.mapper.articulo.TallaPoPrendaMapperEntity;
import com.munamu.munamuinventory.inventory.infrastructure.repository.articulo.TallaPorPrendaJpa;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TallaPoPrendaAdapter implements TallaPorPrendaRepository {

    private final TallaPorPrendaJpa tallaPorPrendaJpa;
    private final TallaPoPrendaMapperEntity tallaPoPrendaMapper;

    public TallaPoPrendaAdapter(TallaPorPrendaJpa tallaPorPrendaJpa, TallaPoPrendaMapperEntity tallaPoPrendaMapper) {
        this.tallaPorPrendaJpa = tallaPorPrendaJpa;
        this.tallaPoPrendaMapper = tallaPoPrendaMapper;
    }

    @Override
    public void saveTallaPorPrenda(TallaPorPrenda tallaPorPrenda) {
        try{
            TallaPorPrendaEntity tallaPorPrendaEntity = tallaPoPrendaMapper.toEntity(tallaPorPrenda);
            tallaPorPrendaJpa.save(tallaPorPrendaEntity);
        }
        catch (DataAccessException e) {
            throw new DatabaseException("Error al agregar la prenda ",e);
        }
    }

    @Override
    public List<TallaPorPrenda> findAllTallaPorPrenda() {
        return List.of();
    }
}
