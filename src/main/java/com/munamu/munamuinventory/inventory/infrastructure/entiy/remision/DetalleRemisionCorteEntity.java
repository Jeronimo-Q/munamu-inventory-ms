package com.munamu.munamuinventory.inventory.infrastructure.entiy.remision;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.TallaPorPrenda;
import com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo.TallaPorPrendaEntity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "detalle_remision_corte")
public class DetalleRemisionCorteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private int cantidadLote;

    @ManyToOne
    @JoinColumn(nullable = false,name = "id_remision_corte")
    private RemisionCorteEntity remisionCorteEntity;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_prenda")
    private TallaPorPrendaEntity tallaPorPrenda;

    public DetalleRemisionCorteEntity() {
        //Necesario para el uso de Jpa
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getCantidadLote() {
        return cantidadLote;
    }

    public void setCantidadLote(int cantidadLote) {
        this.cantidadLote = cantidadLote;
    }

    public RemisionCorteEntity getRemisionCorte() {
        return remisionCorteEntity;
    }

    public void setRemisionCorte(RemisionCorteEntity remisionCorteEntity) {
        this.remisionCorteEntity = remisionCorteEntity;
    }

    public TallaPorPrendaEntity getTallaPorPrenda() {
        return tallaPorPrenda;
    }

    public void setTallaPorPrenda(TallaPorPrendaEntity tallaPorPrenda) {
        this.tallaPorPrenda = tallaPorPrenda;
    }
}
