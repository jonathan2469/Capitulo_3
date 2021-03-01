/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio13;

/**
 *
 * @author DELL
 */
public class BankAccount {
    
    private Integer numeroCuenta;
    private String nombre;
    private Integer saldo;

    public BankAccount() {
        this.numeroCuenta = 0;
        this.nombre = "";
        this.saldo = 0;
    }
    
    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    
    public void deductMonthlyFee(){
        this.saldo =this.saldo-4;
        explainAccountPolicy();
    }
    
    private static void explainAccountPolicy(){
        System.out.println("La politica del Banco reduce tu saldo en 4 cada mes, por decreto gubernamental");
    }
    
    public void showValues(){
        System.out.println("El usuario: "+this.getNombre()+"\nCuenta numero: "+this.getNumeroCuenta());
        System.out.println("Tiene el saldo: "+this.getSaldo());
        explainAccountPolicy();        
    }
    
}
