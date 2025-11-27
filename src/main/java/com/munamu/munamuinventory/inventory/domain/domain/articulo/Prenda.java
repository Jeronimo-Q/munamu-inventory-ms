package com.munamu.munamuinventory.inventory.domain.domain.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Categoria;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.EstadoPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Genero;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.TipoPrenda;

public class Prenda {

    private String id;
    private String referencia;
    private Genero genero;
    private Categoria categoria;
    private TipoPrenda tipoPrenda;
    private EstadoPrenda estadoPrenda;

    public Prenda() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public EstadoPrenda getEstadoPrenda() {
        return estadoPrenda;
    }

    public void setEstadoPrenda(EstadoPrenda estadoPrenda) {
        this.estadoPrenda = estadoPrenda;
    }
}
