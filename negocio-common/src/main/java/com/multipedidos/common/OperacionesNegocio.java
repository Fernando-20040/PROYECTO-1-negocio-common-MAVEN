package com.multipedidos.common;

public class OperacionesNegocio {
    private static final double IVA = 0.12;

    public static double calcularTotalConIVA(double subtotal) {
        return subtotal * (1 + IVA);
    }

    public static double aplicarDescuento(double total, double porcentaje) {
        return total - (total * (porcentaje / 100.0));
    }
}
