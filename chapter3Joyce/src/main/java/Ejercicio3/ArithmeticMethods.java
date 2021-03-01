/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;


/**
 *
 * @author DELL
 */
public class ArithmeticMethods {
    
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    
    
    public ArithmeticMethods(Integer numero){
        this.numero=numero;
    }
    
    public String Imprimirx10(){
        return "El numero mas 10: "+ (this.getNumero()+10);
    }
            
    public String Imprimirx100(){
        return "El numero mas 100: "+ (this.getNumero()+100);
    }

    public String Imprimirx1000(){
        return "El numero mas 1000: "+ (this.getNumero()+1000);
    }
}
