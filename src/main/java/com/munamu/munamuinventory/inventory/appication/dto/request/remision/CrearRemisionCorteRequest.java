package com.munamu.munamuinventory.inventory.appication.dto.request.remision;

import java.time.LocalDateTime;
import java.util.List;

public class CrearRemisionCorteRequest {

    private String numeroRemision;
    private String description;
    private LocalDateTime fechaEntregaCorte;
    private String usuario;
    private String tallerConfeccion;
    private String estadoRemision;
    private List<CrearDetalleRemisionCorteRequest> detalleRemisionCortes;

    public String getNumeroRemision() {
        return numeroRemision;
    }

    public void setNumeroRemision(String numeroRemision) {
        this.numeroRemision = numeroRemision;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getFechaEntregaCorte() {
        return fechaEntregaCorte;
    }

    public void setFechaEntregaCorte(LocalDateTime fechaEntregaCorte) {
        this.fechaEntregaCorte = fechaEntregaCorte;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTallerConfeccion() {
        return tallerConfeccion;
    }

    public void setTallerConfeccion(String tallerConfeccion) {
        this.tallerConfeccion = tallerConfeccion;
    }

    public String getEstadoRemision() {
        return estadoRemision;
    }

    public void setEstadoRemision(String estadoRemision) {
        this.estadoRemision = estadoRemision;
    }

    public List<CrearDetalleRemisionCorteRequest> getDetalleRemisionCortes() {
        return detalleRemisionCortes;
    }

    public void setDetalleRemisionCortes(List<CrearDetalleRemisionCorteRequest> detalleRemisionCortes) {
        this.detalleRemisionCortes = detalleRemisionCortes;
    }
}
