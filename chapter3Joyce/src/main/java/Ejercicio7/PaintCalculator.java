/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author DELL
 */
public class PaintCalculator {
    private Double length;
    private Double width;
    private Double height;

    public PaintCalculator(Double length, Double width, Double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    public Double wallArea(){
        return ((2*this.getHeight()*this.getLength())+(2*this.getHeight()*this.getWidth()));
    }
    
    public String needGallons(){        
        return "Se necesitan "+ this.needGallons2() +" galones";
    }
    
    private Integer needGallons2(){
        int gallons= (int) (this.wallArea()/350);
        if((this.wallArea()%350)!=0){
            gallons=+1;
        }
        return gallons;
    }
    
    public String price(){
        return "El precio de los galones sera de "+ (this.needGallons2()*32)+" dolares";
    }
}
