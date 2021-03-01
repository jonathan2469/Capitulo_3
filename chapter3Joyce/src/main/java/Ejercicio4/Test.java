/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {

    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);
        Percentages numero = new Percentages(20.0, 100.0);
        System.out.println("El porcentaje de los numeros es: " + numero.computePercent());

        System.out.println("Ingrese dos digitos ");
        Percentages2 numero2 = new Percentages2(resp.nextDouble(), resp.nextDouble());
        System.out.println("El porcentaje es: " + numero2.computePercent());
    }
}
