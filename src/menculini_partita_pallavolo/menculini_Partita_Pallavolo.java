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
       Palla palla = new Palla();
       Arbitro arbitro = new Arbitro();
       
        Giocatore g1 = new Giocatore(1, palla, arbitro);
        Giocatore g2 = new Giocatore(2, palla, arbitro);
        
        Thread t1 = new Thread(g1, "Thread giocatore 1");
        Thread t2 = new Thread(g2, "Thread giocatore 2");
        
        t1.start();
        t2.start();
        
    }
    
}
