/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class CreateEvent {
    Scanner leer = new Scanner(System.in);
    
    public void create(){
        
        Event evento1 = new Event();
        
        evento1.iniciar();
        
        evento1.setGuest(promptGuest());
        evento1.setMotto(promptMotto());
        evento1.setPriceGuest(promptPrice());
        
        show(evento1);
        
    }
    
    public int promptGuest(){
        System.out.println("Introduzca el numero de invitados");
        return leer.nextInt();
    }
    
    public String promptMotto(){
        leer.nextLine();
        System.out.println("Introduzca el motto");
        return leer.nextLine();
    }
    
    public double promptPrice(){
        System.out.println("Introduzca el precio");
        return leer.nextDouble();
    }
    
    public void show(Event e){
        System.out.println("");
        System.out.println("Numero de invitados: "+e.getGuest());
        System.out.println("Motto: "+e.getMotto());
        System.out.println("Precio por invitado "+e.getPriceGuest());
        System.out.println("Precio total: "+e.getPrice());
        int n = e.getGuest();
        if (n>=50) {
            System.out.println("Es un evento grande");
        }else{
            System.out.println("Es un evento chico");
        }
        
        
    }
}
