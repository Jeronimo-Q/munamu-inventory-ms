package com.munamu.munamuinventory.inventory.infrastructure.adapters.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Talla;
import com.munamu.munamuinventory.inventory.domain.repository.articulo.TallaPorPrendaRepository;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.TallaPorPrendaEntity;
import com.munamu.munamuinventory.inventory.infrastructure.exception.DatabaseException;
import com.munamu.munamuinventory.inventory.infrastructure.mapper.articulo.TallaPoPrendaMapperEntity;
import com.munamu.munamuinventory.inventory.infrastructure.repository.articulo.TallaPorPrendaJpa;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class TallaPorPrendaJpaAdapter implements TallaPorPrendaRepository {

    private final TallaPorPrendaJpa tallaPorPrendaJpa;
    private final TallaPoPrendaMapperEntity tallaPoPrendaMapper;

    public TallaPorPrendaJpaAdapter(TallaPorPrendaJpa tallaPorPrendaJpa, TallaPoPrendaMapperEntity tallaPoPrendaMapper) {
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
    public List<TallaPorPrenda> findAllTallaPorPrendaPerPrenda(String prendaId) {
        try{
            List<TallaPorPrendaEntity> tallaPorPrendaEntity = tallaPorPrendaJpa.findAllByPrenda_id(UUID.fromString(prendaId));
            return tallaPoPrendaMapper.toDomain(tallaPorPrendaEntity);
        }
        catch (DataAccessException e) {
            throw new DatabaseException("Error al consultar el codigo de barra ",e);
        }
    }

    @Override
    public boolean existsByCodigoBarra(long codigoBarra) {

        try{
            return tallaPorPrendaJpa.existsByCodigoBarra(codigoBarra);
        }
        catch (DataAccessException e) {
            throw new DatabaseException("Error al consultar el codigo de barra ",e);
        }
    }

    @Override
    public boolean existsByTallaAndPrendaAndColor(Talla talla, String prendaId, String colorId) {
        try{
            return tallaPorPrendaJpa.existsByTallaAndPrenda_IdAndColor_Id(talla,UUID.fromString(prendaId),UUID.fromString(colorId));
        }
        catch (DataAccessException e) {
            throw new DatabaseException("Error al consultar la existencia de la prenda por talla,color y prenda_id ",e);
        }
    }
}
