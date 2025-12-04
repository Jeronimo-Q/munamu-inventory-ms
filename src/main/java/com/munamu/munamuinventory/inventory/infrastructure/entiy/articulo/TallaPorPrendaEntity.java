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

    @Column(nullable = false,name = "codigo_barra")
    private long codigoBarra;

    @ManyToOne
    @JoinColumn(name = "prenda_id",nullable = false)
    private PrendaEntity prenda;

    @ManyToOne
    @JoinColumn(name = "color_id",nullable = false)
    private ColorEntity color;


    public TallaPorPrendaEntity() {
        //Es esencial para el uso de JPA
    }

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

    public ColorEntity getColor() {
        return color;
    }

    public void setColor(ColorEntity color) {
        this.color = color;
    }

    public long getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(long codigoBarras) {
        this.codigoBarra = codigoBarras;
    }
}
