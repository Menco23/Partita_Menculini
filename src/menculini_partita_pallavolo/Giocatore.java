/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menculini_partita_pallavolo;
import java.util.Random;

/**
 *
 * @author Studente
 */
public class Giocatore implements Runnable {
      int ID;
      Palla palla;
      Arbitro arbitro;
      Random random = new Random();
      double probabilitaErrore = 0.1; //probabilità del 90% errore
      
      
      public Giocatore(int ID, Palla palla, Arbitro arbitro){
          this.ID=ID;
          this.palla = palla;
          this.arbitro = arbitro;
}
      //Override
      public void run(){
       while (true){
           if (random.nextDouble() < probabilitaErrore) {
           System.out.println("Giocatore " + ID + "ha fatto cadere la palla!");
           arbitro.dichiaraVincitore(ID == 1 ? 2 : 1);
           break;
           } else{
           palla.passaPalla(ID);
           arbitro.controllaGioco(palla);
           Thread.yield();
     }  
   }
 }
}
    
