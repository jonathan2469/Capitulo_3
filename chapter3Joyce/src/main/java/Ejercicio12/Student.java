/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

/**
 *
 * @author DELL
 */
public class Student {
    private Integer idnumber;
    private Integer horascreditos;
    private Integer puntosobtenidos;
    private Double promedio;

    public Student(){
        this.idnumber=9999;
        this.horascreditos=3;
        this.puntosobtenidos=12;                
    }
    
    public Student(Integer idnumber, Integer horascreditos, Integer puntosobtenidos) {
        this.idnumber = idnumber;
        this.horascreditos = horascreditos;
        this.puntosobtenidos = puntosobtenidos;
    }

    public Integer getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(Integer idnumber) {
        this.idnumber = idnumber;
    }

    public Integer getHorascreditos() {
        return horascreditos;
    }

    public void setHorascreditos(Integer horascreditos) {
        this.horascreditos = horascreditos;
    }

    public Integer getPuntosobtenidos() {
        return puntosobtenidos;
    }

    public void setPuntosobtenidos(Integer puntosobtenidos) {
        this.puntosobtenidos = puntosobtenidos;
    }

    public Double getPromedio() {
        this.promedio();
        return this.promedio;
    }
    
    public void promedio(){
        this.promedio = (Double) (((double) this.getPuntosobtenidos()*4)/(double) this.getHorascreditos())/4;        
    }
    
}
