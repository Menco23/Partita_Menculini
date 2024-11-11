/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menculini_partita_pallavolo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mencu
 */
public class Palla {
    boolean inPossessoDiG1 = true;
    int passaggiTotali = 0;
    
    public synchronized void passaPalla(int IDGiocatore) {
    while ((IDGiocatore == 1 && !inPossessoDiG1) || (IDGiocatore == 2 && inPossessoDiG1)) {
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Palla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     System.out.println("Giocatore " + IDGiocatore + " passa la palla. Passaggi totali: " + (++passaggiTotali));
     inPossessoDiG1 = !inPossessoDiG1;
     notifyAll();
    }
    
    public int getPassaggiTotali() {
          return passaggiTotali;
     }
    }
    

