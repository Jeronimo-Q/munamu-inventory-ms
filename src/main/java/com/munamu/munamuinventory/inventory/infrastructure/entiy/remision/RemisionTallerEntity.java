package com.munamu.munamuinventory.inventory.infrastructure.entiy.remision;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "remision_taller")
public class RemisionTallerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String numeroRemision;
    @Column
    private String observacion;
    @Column(nullable = false)
    private LocalDateTime fechaEntregaTaller;
    @Column(nullable = false)
    private String usuario;

    @ManyToOne
    @JoinColumn(nullable = false,name = "id_remision_corte")
    private RemisionCorteEntity remisionCorteEntity;
    @OneToMany(mappedBy = "remisionTallerEntity")
    private List<DetalleRemisionTallerEntity> detalleRemisionTallerEntities;

    public RemisionTallerEntity() {
        //Necesario para el uso de Jpa
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public RemisionCorteEntity getRemisionCorte() {
        return remisionCorteEntity;
    }

    public void setRemisionCorte(RemisionCorteEntity remisionCorteEntity) {
        this.remisionCorteEntity = remisionCorteEntity;
    }

    public List<DetalleRemisionTallerEntity> getDetalleRemisionTallers() {
        return detalleRemisionTallerEntities;
    }

    public void setDetalleRemisionTallers(List<DetalleRemisionTallerEntity> detalleRemisionTallerEntities) {
        this.detalleRemisionTallerEntities = detalleRemisionTallerEntities;
    }
}
