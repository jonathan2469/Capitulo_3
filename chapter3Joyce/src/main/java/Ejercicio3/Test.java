/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        ArithmeticMethods numero = new ArithmeticMethods(500);
        
        System.out.println(numero.Imprimirx10());
        System.out.println(numero.Imprimirx100());
        System.out.println(numero.Imprimirx1000());
        
        Scanner pen = new Scanner(System.in);
        System.out.println("\nIngrese dos numero para usar los metodos");
        ArithmeticMethods2 numero2 = new ArithmeticMethods2(pen.nextInt(),pen.nextInt());
        System.out.println(numero2.Imprimirx10());
        System.out.println(numero2.Imprimir100());
        System.out.println(numero2.Imprimirx1000());
    }
}
