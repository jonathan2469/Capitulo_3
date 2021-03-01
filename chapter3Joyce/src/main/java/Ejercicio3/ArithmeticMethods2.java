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
public class ArithmeticMethods2 {
    
    private Integer numero1;
    private Integer numero2;

    public ArithmeticMethods2(Integer uno, Integer dos){
        this.numero1=uno;
        this.numero2=dos;
    }
    
    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }
    
    public String Imprimirx10(){
        return "El numero uno mas 10: "+ (this.getNumero1()+10)+"\nEl numero dos mas 10: "+ (this.getNumero2()+10);
    }
            
    public String Imprimir100(){
        return "El numero uno mas 100: "+ (this.getNumero1()+100)+"\nEl numero dos mas 100: "+ (this.getNumero2()+100);
    }

    public String Imprimirx1000(){
        return "El numero uno mas 1000: "+ (this.getNumero1()+1000)+"\nEl numero dos mas 1000: "+ (this.getNumero2()+1000);
    }
    
    
}
