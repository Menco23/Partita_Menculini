/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menculini_partita_pallavolo;

/**
 *
 * @author Studente
 */
public class menculini_Partita_Pallavolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Giocatore g1 = new Giocatore(1); //non è un thread perchè implementa solo Runnable
        Thread t1= new Thread(g1, "Thread giocatore 1"); //è un thread
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("ID GIOCATORE: "+g1.ID + "\nPRIORITA': "+t1.getPriority()+"\nNOME: "+t1.getName());
        Giocatore g2 = new Giocatore(2);
        Thread t2= new Thread(g2);
        t2.start();
        
    }
    
}
