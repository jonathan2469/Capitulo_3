/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author DELL
 */
public class Percentages2 {

    private Double uno;
    private Double dos;

    public Percentages2(Double uno, Double dos) {
        this.uno = uno;
        this.dos = dos;
    }

    public Double getUno() {
        return uno;
    }

    public void setUno(Double uno) {
        this.uno = uno;
    }

    public Double getDos() {
        return dos;
    }

    public void setDos(Double dos) {
        this.dos = dos;
    }

    public Integer computePercent() {
        int porce = (int) ((this.getUno() / this.getDos()) * 100);
        return porce;
    }
}
