/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14;

/**
 *
 * @author DELL
 */
public class TestPainting {
    
    public static void main(String[] args) {
       Painting pint =new  Painting();
       Painting pint2 =new  Painting();
       Painting pint3 =new  Painting();
       
       pint.solicitar();
       pint2.solicitar();
       
       
       pint.mostrar();
       pint2.mostrar();
       pint3.mostrar();
    }
}
