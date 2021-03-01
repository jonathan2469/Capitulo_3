/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);
        System.out.println("Desea convertir a pulgadas[0] o  a galones[1]");
        int leer = resp.nextInt();
        System.out.println("Dame el numero que quieres convetir:");
        MetricConversion pulga = new MetricConversion(resp.nextInt());
        if(leer==1){
            System.out.println(pulga.conversionGalon());
        }else{
            System.out.println(pulga.conversionPulgada());
        }
        
    }
}
