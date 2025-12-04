package com.munamu.munamuinventory.inventory.util.expception;

import java.util.UUID;

public class ErrorCodeGenerator {

    public static String generate(){
        return "ERR-"+ UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }

    private ErrorCodeGenerator() {
    }
}
