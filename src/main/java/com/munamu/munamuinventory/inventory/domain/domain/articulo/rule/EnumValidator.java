package com.munamu.munamuinventory.inventory.domain.domain.articulo.rule;

import com.munamu.munamuinventory.inventory.domain.exception.DomainException;

public class EnumValidator {

    private EnumValidator() {
    }

    public static <E extends Enum<E>> void enumValidator(Class<E> enumClass, String valor, String campo) {
        try {
            Enum.valueOf(enumClass, valor.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new DomainException(
                    "El valor '" + valor + "' no es válido para el campo " + campo
            );
        }
    }
}
