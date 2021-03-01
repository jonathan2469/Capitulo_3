/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("Tus cartas son:\n");
        int n=1;
        do{
            Card carta1=new Card();
            Card carta2=new Card();
            carta1.mostrar();
            carta2.mostrar();
            System.out.println("Quieres barajear de nuevo [1]si  [0]no");
            n=pen.nextInt();
        }while(n!=0);
        
        
    }
            
}
