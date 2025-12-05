package com.munamu.munamuinventory.inventory.domain.domain.remision;

import java.time.LocalDateTime;
import java.util.List;

public class RemisionTaller {
    private String id;
    private String numeroRemision;
    private String observacion;
    private LocalDateTime fechaEntregaTaller;
    private String usuario;
    private RemisionCorte remisionCorte;
    private List<DetalleRemisionTaller> detalleRemisionTallers;

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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public LocalDateTime getFechaEntregaTaller() {
        return fechaEntregaTaller;
    }

    public void setFechaEntregaTaller(LocalDateTime fechaEntregaTaller) {
        this.fechaEntregaTaller = fechaEntregaTaller;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public RemisionCorte getRemisionCorte() {
        return remisionCorte;
    }

    public void setRemisionCorte(RemisionCorte remisionCorte) {
        this.remisionCorte = remisionCorte;
    }

    public List<DetalleRemisionTaller> getDetalleRemisionTallers() {
        return detalleRemisionTallers;
    }

    public void setDetalleRemisionTallers(List<DetalleRemisionTaller> detalleRemisionTallers) {
        this.detalleRemisionTallers = detalleRemisionTallers;
    }
}
