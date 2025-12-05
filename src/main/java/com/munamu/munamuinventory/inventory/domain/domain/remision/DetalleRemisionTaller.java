package com.munamu.munamuinventory.inventory.domain.domain.remision;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.remision.enums.EstadoEntregaPrenda;

public class DetalleRemisionTaller {
    private String id;
    private EstadoEntregaPrenda estado;
    private RemisionTaller remisionTaller;
    private TallaPorPrenda tallaPorPrenda;
    private int cantidad;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EstadoEntregaPrenda getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntregaPrenda estado) {
        this.estado = estado;
    }

    public RemisionTaller getRemisionTaller() {
        return remisionTaller;
    }

    public void setRemisionTaller(RemisionTaller remisionTaller) {
        this.remisionTaller = remisionTaller;
    }

    public TallaPorPrenda getTallaPorPrenda() {
        return tallaPorPrenda;
    }

    public void setTallaPorPrenda(TallaPorPrenda tallaPorPrenda) {
        this.tallaPorPrenda = tallaPorPrenda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
