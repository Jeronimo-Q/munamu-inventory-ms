package com.munamu.munamuinventory.inventory.infrastructure.entiy.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.enums.Categoria;
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
    private String referencia;

    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @Enumerated(EnumType.STRING)
    private TipoPrenda tipoPrenda;
    @Enumerated(EnumType.STRING)
    private EstadoPrenda estadoPrenda;

    public PrendaEntity() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
}
