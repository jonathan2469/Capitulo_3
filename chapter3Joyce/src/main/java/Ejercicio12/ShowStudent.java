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
public class ShowStudent {
    public static void main(String[] args) {
        Student estudiante= new Student();
        
        estudiante.setIdnumber(77);
        estudiante.setHorascreditos(8);
        estudiante.setPuntosobtenidos(6);
        
        System.out.println(estudiante.getIdnumber());
        System.out.println(estudiante.getHorascreditos());
        System.out.println(estudiante.getPuntosobtenidos());
        System.out.println(estudiante.getPromedio());
        
    }
}
