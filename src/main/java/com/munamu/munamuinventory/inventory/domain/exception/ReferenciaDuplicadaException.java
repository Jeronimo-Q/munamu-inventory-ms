package com.munamu.munamuinventory.inventory.domain.exception;

public class ReferenciaDuplicadaException extends DomainException {
    public ReferenciaDuplicadaException(int referencia) {
        super("La referencia " + referencia + " ya existe.");
    }
}
