/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author DELL
 */
public class MetricConversion {
    private Integer numero;
    private static final Double inch = 2.54;
    private static final Double gallons = 3.7854;
    
    public MetricConversion(Integer numero){
        this.numero=numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public String conversionPulgada(){
        return "El numero convertido "+this.getNumero()+" a pulgadas es: "+(this.getNumero()*inch);
    }
    
    public String conversionGalon(){
        return "El numero convertido "+this.getNumero()+" a galones es: "+(this.getNumero()*gallons);
    }
}
