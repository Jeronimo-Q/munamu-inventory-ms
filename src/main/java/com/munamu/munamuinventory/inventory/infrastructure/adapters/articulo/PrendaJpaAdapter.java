package com.munamu.munamuinventory.inventory.infrastructure.adapters.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;
import com.munamu.munamuinventory.inventory.domain.repository.articulo.PrendaRepository;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.PrendaEntity;
import com.munamu.munamuinventory.inventory.infrastructure.mapper.articulo.PrendaMapperEntity;
import com.munamu.munamuinventory.inventory.infrastructure.repository.articulo.PrendaRepositoryJpa;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PrendaJpaAdapter implements PrendaRepository {

    private final PrendaRepositoryJpa prendaRepositoryJpa;
    private final PrendaMapperEntity prendaMapperEntity;

    public PrendaJpaAdapter(PrendaRepositoryJpa prendaRepositoryJpa, PrendaMapperEntity prendaMapperEntity) {
        this.prendaRepositoryJpa = prendaRepositoryJpa;
        this.prendaMapperEntity = prendaMapperEntity;
    }

    @Override
    public String save(Prenda prenda) {
        PrendaEntity prendaEntity = prendaMapperEntity.toEntity(prenda);
        prendaRepositoryJpa.save(prendaEntity);
        return "Se guardo de manera exitosa la prenda";
    }

    @Override
    public List<Prenda> findAll() {
        List<PrendaEntity> prendaEnity = prendaRepositoryJpa.findAll();
        return prendaMapperEntity.toDomain(prendaEnity);
    }

    @Override
    public Optional<Prenda> findByReferencia(int referencia) {
        PrendaEntity prendaEntity = prendaRepositoryJpa.findByReferencia(referencia);
        if(prendaEntity == null) {
            return Optional.empty();
        }

        return Optional.of(prendaMapperEntity.toDomain(prendaEntity));
    }

    @Override
    public boolean existsByReferencia(int referencia) {
        return prendaRepositoryJpa.existsByReferencia(referencia);
    }

}
