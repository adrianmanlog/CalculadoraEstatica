/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miejemplo.utilidades;

/**
 *
 * @author usuario
 */
public class Modulo {

    public static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Módulo por cero");
        }
        return a % b;
    }
    
}
