package com.munamu.munamuinventory.inventory.domain.repository.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PrendaRepository {
    void save(Prenda prenda);
    List<Prenda> findAll();
    Optional<Prenda> findByReferencia(int referencia);

    //REGLAS DE NEGOCIO
    boolean existsByReferencia(int referencia);
    boolean existsById(String id);
}
