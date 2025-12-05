package com.munamu.munamuinventory.inventory.infrastructure.entiy.remision;

import com.munamu.munamuinventory.inventory.domain.domain.remision.enums.EstadoRemision;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "remision_corte")
public class RemisionCorteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String numeroRemision;

    @Column
    private String description;

    @Column(nullable = false)
    private LocalDateTime fechaEntregaCorte;

    @Column(nullable = false)
    private String usuario;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_taller_confeccion")
    private TallerConfeccionEntity tallerConfeccionEntity;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoRemision estadoRemision;

    @OneToMany(mappedBy = "remisionCorteEntity")
    private List<DetalleRemisionCorteEntity> detalleRemisionCorteEntities;

    public RemisionCorteEntity() {
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

    public TallerConfeccionEntity getTallerConfeccion() {
        return tallerConfeccionEntity;
    }

    public void setTallerConfeccion(TallerConfeccionEntity tallerConfeccionEntity) {
        this.tallerConfeccionEntity = tallerConfeccionEntity;
    }

    public EstadoRemision getEstadoRemision() {
        return estadoRemision;
    }

    public void setEstadoRemision(EstadoRemision estadoRemision) {
        this.estadoRemision = estadoRemision;
    }

    public List<DetalleRemisionCorteEntity> getDetalleRemisionCortes() {
        return detalleRemisionCorteEntities;
    }

    public void setDetalleRemisionCortes(List<DetalleRemisionCorteEntity> detalleRemisionCorteEntities) {
        this.detalleRemisionCorteEntities = detalleRemisionCorteEntities;
    }
}
