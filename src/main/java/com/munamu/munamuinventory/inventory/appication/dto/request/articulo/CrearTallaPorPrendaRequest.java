package com.munamu.munamuinventory.inventory.appication.dto.request.articulo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class CrearTallaPorPrendaRequest {

    @NotNull
    private String talla;
    @NotNull
    private String color;
    @NotNull
    private String idPrenda;
    @NotNull
    @Positive
    private String codigoBarra;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(String idPrenda) {
        this.idPrenda = idPrenda;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
}
