package com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.EstadoPrenda;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Genero;
import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.TipoPrenda;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "prenda")
public class PrendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private int referencia;

    @Column(nullable = false)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genero genero;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoPrenda tipoPrenda;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoPrenda estadoPrenda;

    public PrendaEntity() {
        // Es esencial para que funciono JPA
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public EstadoPrenda getEstadoPrenda() {
        return estadoPrenda;
    }

    public void setEstadoPrenda(EstadoPrenda estadoPrenda) {
        this.estadoPrenda = estadoPrenda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
