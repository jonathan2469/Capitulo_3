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
public class MyCharacter {
    private String color;
    private Integer ojos;
    private Integer vidas;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getOjos() {
        return ojos;
    }

    public void setOjos(Integer ojos) {
        this.ojos = ojos;
    }

    public Integer getVidas() {
        return vidas;
    }

    public void setVidas(Integer vidas) {
        this.vidas = vidas;
    }
    
    public void mostrar(){
        System.out.println("Este extraterrestre tiene: ");
        System.out.println(this.getOjos()+" ojos.");
        System.out.println(this.getVidas()+" vidas.");
        System.out.println("Y es de color "+this.getColor());
    }
    
}
