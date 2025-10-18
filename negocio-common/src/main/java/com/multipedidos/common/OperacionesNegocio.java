package com.multipedidos.common;

public class OperacionesNegocio {

    // Calcula total con IVA del 12%
    public static double calcularTotalConIVA(double subtotal) {
        return subtotal * 1.12;
    }

    // Aplica un descuento al total
    public static double aplicarDescuento(double total, double porcentaje) {
        return total - (total * (porcentaje / 100));
    }
}
