package com.munamu.munamuinventory.inventory.domain.repository.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.Prenda;

import java.util.List;
import java.util.Optional;

public interface PrendaRepository {
    String save(Prenda prenda);
    List<Prenda> findAll();
    Optional<Prenda> findByReferencia(int referencia);

    //REGLAS DE NEGOCIO
    boolean existsByReferencia(int referencia);
}
