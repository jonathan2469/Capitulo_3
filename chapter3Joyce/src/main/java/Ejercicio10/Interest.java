/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

/**
 *
 * @author DELL
 */
public class Interest {
    private Integer dinero;
    private static final Double interes = 0.05;

    public Interest(Integer dinero) {
        this.dinero = dinero;
    }

    public Integer getDinero() {
        return dinero;
    }
    
    public Double invercion(){
        return this.getDinero()*interes;
    }
    
    public String miInvercion(){
        return "Tu dinero se convertira: "+(this.getDinero()+this.invercion());
    }
}
