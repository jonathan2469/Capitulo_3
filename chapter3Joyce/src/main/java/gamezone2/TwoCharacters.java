/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

/**
 *
 * @author DELL
 */
public class TwoCharacters {
    public static void main(String[] args) {
        MyCharacter ovni1= new MyCharacter();
        MyCharacter ovni2= new MyCharacter();
        
        ovni1.setColor("verde");
        ovni1.setOjos(8);
        ovni1.setVidas(4);
        
        ovni2.setColor("azul");
        ovni2.setOjos(89);
        ovni2.setVidas(1);
        
        ovni1.mostrar();
        ovni2.mostrar();
    }
}
