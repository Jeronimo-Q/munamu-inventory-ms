package com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Talla;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "talla_por_prenda")
public class TallaPorPrendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private Talla talla;

    @ManyToOne
    @JoinColumn(name = "prenda_id",nullable = false)
    private PrendaEntity prenda;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public PrendaEntity getPrenda() {
        return prenda;
    }

    public void setPrenda(PrendaEntity prenda) {
        this.prenda = prenda;
    }

    public TallaPorPrendaEntity() {
    }
}
