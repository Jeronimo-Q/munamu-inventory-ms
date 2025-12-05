package com.munamu.munamuinventory.inventory.domain.repository.articulo;

import com.munamu.munamuinventory.inventory.domain.domain.articulo.Color;

public interface ColorRepository {
    Color getColor(String id);
    boolean existsColor(String id);
    void addColor(Color color);
}
