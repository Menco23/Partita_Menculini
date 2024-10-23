/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menculini_partita_pallavolo;

/**
 *
 * @author Studente
 */
public class Giocatore implements Runnable {
      int numPassaggi;
      int ID;
      
      public Giocatore(int ID){
          this.numPassaggi=0;
          this.ID=ID;
}
      public void run(){
       while (true){
           System.out.println("ID GIOCATORE: "+this.ID+" NUMERO PASSAGGI: "+this.numPassaggi);
           this.numPassaggi++;
           Thread.currentThread().yield();
}  
      }
}
    
