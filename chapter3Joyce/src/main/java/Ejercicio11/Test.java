/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        Sandwich mio =  new Sandwich();
        
        mio.setIngrediente(Ingrediente.QUESILLO);
        mio.setPan(Pan.TRIGO);
        mio.setPrecio(13.5);
        
        System.out.println(mio.getIngrediente());
        System.out.println(mio.getPan());
        System.out.println(mio.getPrecio());
    }
}
