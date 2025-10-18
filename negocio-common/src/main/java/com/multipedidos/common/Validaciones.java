package com.multipedidos.common;

public class Validaciones {

    // Valida formato de código tipo ABC-1234
    public static boolean validarCodigo(String codigo) {
        return codigo != null && codigo.matches("[A-Z]{3}-\\d{4}");
    }
}
