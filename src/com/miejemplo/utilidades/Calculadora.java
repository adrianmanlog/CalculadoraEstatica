/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.miejemplo.utilidades;

/**
 *
 * @author usuario
 */
public class Calculadora implements InterfaceCalculadora {

    public int resultado;

    @Override
    public int sumar(int operador1, int operador2) {
        return operador1 + operador2;
    }

    @Override
    public int restar(int operador1, int operador2) {
        return operador1 - operador2;
    }

    @Override
    public int multiplicar(int operador1, int operador2) {
        return operador1 * operador2;
    }

    @Override
    public int dividir(int operador1, int operador2) {
        if (operador2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return operador1 / operador2;
    }

    @Override
    public int modulo(int operador1, int operador2) {
        if (operador2 == 0) {
            throw new ArithmeticException("Módulo por cero");
        }
        return operador1 % operador2;
    }

    @Override
    public int operacion(int a, int b, String operacion) {
        if (null != operacion) {
            switch (operacion) {
                case "sumar":
                    return sumar(a, b);
                case "restar":
                    return restar(a, b);
                case "multiplicar":
                    return multiplicar(a, b);
                case "dividir":
                    return dividir(a, b);
                case "modulo":
                    return modulo(a, b);
                default:
                    throw new IllegalArgumentException("Operación no válida");
            }
        }
        return 0;
    }
}
