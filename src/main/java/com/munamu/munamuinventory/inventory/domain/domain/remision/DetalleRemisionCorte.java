package com.munamu.munamuinventory.inventory.domain.domain.remision;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;

public class DetalleRemisionCorte {
    private String id;
    private int cantidadLote;
    private RemisionCorte remisionCorte;
    private TallaPorPrenda tallaPorPrenda;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCantidadLote() {
        return cantidadLote;
    }

    public void setCantidadLote(int cantidadLote) {
        this.cantidadLote = cantidadLote;
    }

    public RemisionCorte getRemisionCorte() {
        return remisionCorte;
    }

    public void setRemisionCorte(RemisionCorte remisionCorte) {
        this.remisionCorte = remisionCorte;
    }

    public TallaPorPrenda getTallaPorPrenda() {
        return tallaPorPrenda;
    }

    public void setTallaPorPrenda(TallaPorPrenda tallaPorPrenda) {
        this.tallaPorPrenda = tallaPorPrenda;
    }
}
