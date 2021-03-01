/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
       
        Scanner resp =new  Scanner(System.in);
        System.out.println("Dame las tres dimensiones de cuarto longitud/ancho/alto");
        PaintCalculator cuarto = new PaintCalculator(resp.nextDouble(),resp.nextDouble(),resp.nextDouble());
        
        System.out.println(cuarto.needGallons());
        System.out.println(cuarto.price());
    }
}
