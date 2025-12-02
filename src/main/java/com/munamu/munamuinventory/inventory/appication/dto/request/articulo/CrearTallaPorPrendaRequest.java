package com.munamu.munamuinventory.inventory.appication.dto.request.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.Color;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Talla;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.List;
import java.util.UUID;

public class CrearTallaPorPrendaRequest {

    @NotNull
    private Talla tallas;
    @NotNull
    private String colors;
    @NotNull
    private UUID idPrenda;
    @NotNull
    @Positive
    private String codigoDebarras;

    public Talla getTallas() {
        return tallas;
    }

    public void setTallas(Talla tallas) {
        this.tallas = tallas;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public UUID getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(UUID idPrenda) {
        this.idPrenda = idPrenda;
    }

    public String getCodigoDebarras() {
        return codigoDebarras;
    }

    public void setCodigoDebarras(String codigoDebarras) {
        this.codigoDebarras = codigoDebarras;
    }
}
