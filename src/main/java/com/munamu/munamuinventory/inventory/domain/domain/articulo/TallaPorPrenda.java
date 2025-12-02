package com.munamu.munamuinventory.inventory.domain.domain.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Talla;

public class TallaPorPrenda {

    private String id;
    private Talla talla;
    private long codigoBarra;
    private Prenda prenda;
    private Color color;

    private TallaPorPrenda() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(long codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
}
