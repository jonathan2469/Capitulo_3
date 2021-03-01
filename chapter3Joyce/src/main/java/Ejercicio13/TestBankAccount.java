/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio13;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount persona1 = new BankAccount();
        BankAccount persona2 = new BankAccount();
        BankAccount persona3 = new BankAccount();
        BankAccount persona4 = new BankAccount();
        Scanner pen = new Scanner(System.in);
       
        System.out.println("Dame los valores por persona");
        
        System.out.println("Persona uno\nNombre: ");
        persona1.setNombre(pen.nextLine());
        System.out.println("Cuenta: ");
        persona1.setNumeroCuenta(pen.nextInt());
        System.out.println("Saldo: ");
        persona1.setSaldo(pen.nextInt());
        
        System.out.println("Persona dos\nNombre: ");
        persona2.setNombre(pen.next());
        System.out.println("Cuenta: ");
        persona2.setNumeroCuenta(pen.nextInt());
        System.out.println("Saldo: ");
        persona2.setSaldo(pen.nextInt());
        
        System.out.println("Persona tres\nNombre: ");
        persona3.setNombre(pen.next());
        System.out.println("Cuenta: ");
        persona3.setNumeroCuenta(pen.nextInt());
        System.out.println("Saldo: ");
        persona3.setSaldo(pen.nextInt());
        
        
        persona1.showValues();
        persona2.showValues();
        persona3.showValues();
        persona4.showValues();
        
        
    }
}
