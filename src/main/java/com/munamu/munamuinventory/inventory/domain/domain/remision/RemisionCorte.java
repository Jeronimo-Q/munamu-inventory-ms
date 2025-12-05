package com.munamu.munamuinventory.inventory.domain.domain.remision;

import com.munamu.munamuinventory.inventory.domain.domain.remision.enums.EstadoRemision;
import java.time.LocalDateTime;
import java.util.List;

public class RemisionCorte {
    private String id;
    private String numeroRemision;
    private String description;
    private LocalDateTime fechaEntregaCorte;
    private String usuario;
    private TallerConfeccion tallerConfeccion;
    private EstadoRemision estadoRemision;
    private List<DetalleRemisionCorte> detalleRemisionCortes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public TallerConfeccion getTallerConfeccion() {
        return tallerConfeccion;
    }

    public void setTallerConfeccion(TallerConfeccion tallerConfeccion) {
        this.tallerConfeccion = tallerConfeccion;
    }

    public EstadoRemision getEstadoRemision() {
        return estadoRemision;
    }

    public void setEstadoRemision(EstadoRemision estadoRemision) {
        this.estadoRemision = estadoRemision;
    }

    public List<DetalleRemisionCorte> getDetalleRemisionCortes() {
        return detalleRemisionCortes;
    }

    public void setDetalleRemisionCortes(List<DetalleRemisionCorte> detalleRemisionCortes) {
        this.detalleRemisionCortes = detalleRemisionCortes;
    }
}
