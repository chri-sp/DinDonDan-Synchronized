/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;

/**@author Ballabio Edoardo
 *
 * Questa classe collabora con la classe ThreadCampane ed estende la classe Thread
 */
public class ThDon extends Thread{   
    /** @authot Ballabio Edoardo
     * 
     * Attributo che indica se bisogna usare il metodo sleep() della classe estesa Thread.
     */
    private boolean usatoSleep;
    /** @authot Ballabio Edoardo
     * 
     * Attributo che indica se va usato il metodo yield() della classe estesa Thread.
     */
    private boolean usatoYield;
    
    private CDatiCondivisi PtrDati;
    
    /** @authot Ballabio Edoardo
     * 
     * @brief: Metodo costruttore utilizzato per inizializzare il thread ThDon.
     * 
     * In questo metodo viene richiamato il costruttore della classe Thread e vengono inizializzati gli attributi usatoSleep e usatoYield tramite passaggio per parametri.
     * 
     * @param1 sleep Parametro che inizializza usatoSleep a true o false.
     * @param2 yield Parametro che inizializza usatoYield a true o false.
     */
    public ThDon(boolean sleep, boolean yield, CDatiCondivisi dati) {
            super();
            usatoSleep = sleep;
            usatoYield = yield;
            this.PtrDati = dati;
        }
    /**@author Ballabio Edoardo
     *
     * @brief: Metodo che stampa la stringa "DON".
     * 
     * Questo metodo stamperà ciclicamente la stringa DON mettendo il thread a riposo per un secondo tra un output e l'altro.
     * Ogni volta che verrà stampata la stringa DIN verrà incrementata la variabile contDin, che è appunto un contatore che ci servirà per il confronto finale con gli altri thread.
     * Nel caso in cui il thread verrà intrrota in output verrà stampata una stringa di congedo.
     */
    public void run() {
        try {
            while(true) {
                if(Thread.currentThread().isInterrupted()) {
                        break;
                    }                    
                System.out.println("DON");
                PtrDati.setContDon(PtrDati.getContDon()+1);
                    if(usatoSleep) {
                        Thread.sleep(1000);
                    }
                    if(usatoYield) {
                        Thread.yield();
                    }                                
            }
        }
                catch (InterruptedException ex) {
                   
                } 
    }
}