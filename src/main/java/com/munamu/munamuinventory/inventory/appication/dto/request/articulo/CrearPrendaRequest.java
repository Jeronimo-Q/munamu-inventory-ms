package com.munamu.munamuinventory.inventory.appication.dto.request.articulo;
import jakarta.validation.constraints.*;

public class CrearPrendaRequest {

    @NotNull
    @Positive
    @Max(999999) @Min(100)
    private int referencia;

    @NotBlank
    private String genero;

    @NotBlank
    private String tipoPrenda;

    @NotBlank
    private String descripcion;

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
