/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

/**
 *
 * @author DELL
 */
public class Salary {
    private Double hourlyPay;
    private Integer regularhurs;
    private Integer overtime;

    public Salary(Double hourlyPay, Integer regularhurs, Integer overtime) {
        this.hourlyPay = hourlyPay;
        this.regularhurs = regularhurs;
        this.overtime = overtime;
    }

    public Double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(Double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public Integer getRegularhurs() {
        return regularhurs;
    }

    public void setRegularhurs(Integer regularhurs) {
        this.regularhurs = regularhurs;
    }

    public Integer getOvertime() {
        return overtime;
    }

    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
    }
    
    public Double salarioExtra(){
        return this.getHourlyPay()*1.5*this.getOvertime();
    }
    
    public String salario(){
        return String.format("El salario es: %.2f", ((this.getHourlyPay()*this.getRegularhurs())+this.salarioExtra()));
    }
}
