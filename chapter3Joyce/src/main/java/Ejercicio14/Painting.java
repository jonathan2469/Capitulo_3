/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Painting {
    private String titulo;
    private String artista;
    private String medio;
    private Integer precio;
    private Integer comision;

    public Painting() {
        this.titulo="S/N";
        this.artista ="S/N";
        this.medio="S/N";
        this.precio=0;
        this.comision=0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
        this.comision= (precio*20)/100;
    }

    public Integer getComision() {
        return comision;
    }

   public void solicitar(){
       System.out.println("Dame los valores de la pintura");
       Scanner pen = new Scanner(System.in);
       System.out.println("Nombre pintura: ");
       this.setTitulo(pen.nextLine());
       System.out.println("Nombre del artista: ");
       this.setArtista(pen.next());
       System.out.println("Medio por el cual fue creado:");
       this.setMedio(pen.next());
       System.out.println("Precio: ");
       this.setPrecio(pen.nextInt());
   }
    
    public void mostrar(){
        
       System.out.println("\n\nNombre pintura: "+this.getTitulo());
       System.out.println("Nombre del artista: "+this.getArtista());
       System.out.println("Medio: "+this.getMedio());       
       System.out.println("Precio: "+this.getPrecio());
       System.out.println("Comision: "+this.getComision());
       politicas();
    }
    
    public static void politicas(){
        System.out.println("La empresa cobra un 20% de comision por cualquier pintura");
    }
}
