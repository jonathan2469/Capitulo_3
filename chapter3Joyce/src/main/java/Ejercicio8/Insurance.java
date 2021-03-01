/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author DELL
 */
public class Insurance {
    private Integer anioNac;
    private Integer anioAct;

    public Insurance(Integer anioNac, Integer anioAct) {
        this.anioNac = anioNac;
        this.anioAct = anioAct;
    }

    public Integer getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(Integer anioNac) {
        this.anioNac = anioNac;
    }

    public Integer getAnioAct() {
        return anioAct;
    }

    public void setAnioAct(Integer anioAct) {
        this.anioAct = anioAct;
    }
    
    public String primaAnual(){
        int edad= this.getAnioAct()-this.getAnioNac();
        return "El pago es de: "+(((edad%10)+15)*20);
    }
            
}
