/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem;

/**
 *
 * @author jonat
 */
public class Event {
     private int n_guests;
    private String motto;
    private double price;
    private double price_guest;
    
    public void iniciar(){
        n_guests = 0;
        motto = "";
        price =0;
        price_guest = 0;
    }
    
    public void setGuest(int n){
        this.n_guests=n;
    }
    
    public void setMotto(String m){
        this.motto = m;
    }
    
    public void setPriceGuest(double p){
        this.price_guest = p;
        setPrice();
    }
    
    
    public void setPrice(){
        this.price = this.price_guest*this.n_guests;
    }
    
    public int getGuest(){
        return this.n_guests;
    }
    
    public String getMotto(){
        return this.motto;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public double getPriceGuest(){
        return this.price_guest;
    }
}
