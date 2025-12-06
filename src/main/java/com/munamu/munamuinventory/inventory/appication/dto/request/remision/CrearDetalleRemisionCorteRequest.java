package com.munamu.munamuinventory.inventory.appication.dto.request.remision;

public class CrearDetalleRemisionCorteRequest {
    private int cantidadLote;
    private String tallaPorPrenda;

    public int getCantidadLote() {
        return cantidadLote;
    }

    public void setCantidadLote(int cantidadLote) {
        this.cantidadLote = cantidadLote;
    }

    public String getTallaPorPrenda() {
        return tallaPorPrenda;
    }

    public void setTallaPorPrenda(String tallaPorPrenda) {
        this.tallaPorPrenda = tallaPorPrenda;
    }
}
