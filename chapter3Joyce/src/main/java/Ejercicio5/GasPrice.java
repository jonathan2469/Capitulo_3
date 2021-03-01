/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class GasPrice {
    private Integer pricePerBarrel;
    private static final Double precio1 = 3.5;
    private static final Double precio2 = 4.0;

     
    public String precio(){
        Scanner pen= new Scanner(System.in);
        System.out.println("Ingrese el precio por barril:");
        this.pricePerBarrel= pen.nextInt();
        
        return "El precio ocilara entre: "+((this.getPricePerBarrel()*precio1)/100)+" y "+((this.getPricePerBarrel()*precio2)/100);        
    }

    public Integer getPricePerBarrel() {
        return pricePerBarrel;
    }

    public void setPricePerBarrel(Integer pricePerBarrel) {
        this.pricePerBarrel = pricePerBarrel;
    }
    
}
