package com.munamu.munamuinventory.inventory.infrastructure.entiy.remision;

import com.munamu.munamuinventory.inventory.domain.domain.remision.enums.EstadoEntregaPrenda;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.TallaPorPrendaEntity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "detalle_remision_taller")
public class DetalleRemisionTallerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoEntregaPrenda estado;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_remision_taller")
    private RemisionTallerEntity remisionTallerEntity;

    @ManyToOne
    @JoinColumn(nullable = false,name = "id_prenda")
    private TallaPorPrendaEntity tallaPorPrenda;

    @Column(nullable = false)
    private int cantidad;

    public DetalleRemisionTallerEntity() {
        //Necesario para el uso de Jpa
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public EstadoEntregaPrenda getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntregaPrenda estado) {
        this.estado = estado;
    }

    public RemisionTallerEntity getRemisionTaller() {
        return remisionTallerEntity;
    }

    public void setRemisionTaller(RemisionTallerEntity remisionTallerEntity) {
        this.remisionTallerEntity = remisionTallerEntity;
    }

    public TallaPorPrendaEntity getTallaPorPrenda() {
        return tallaPorPrenda;
    }

    public void setTallaPorPrenda(TallaPorPrendaEntity tallaPorPrenda) {
        this.tallaPorPrenda = tallaPorPrenda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
