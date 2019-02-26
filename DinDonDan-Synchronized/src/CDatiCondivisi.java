/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ballabio Edoardo
 */
public class CDatiCondivisi {
    /**
     * @author Ballabio Edoardo
     *
     * Attributo che indica quante volte viene stampato DIN
     */
    private int ContDin;
    
    /**
     * @author Ballabio Edoardo
     *
     * Attributo che indica quante volte viene stampato DON
     */
    private int ContDon;
    
    /**
     * @author Ballabio Edoardo
     *
     * Attributo che indica quante volte viene stampato DAN
     */
    private int ContDan;
    
    /**
     * @author Ballabio Edoardo
     * 
     * Attributo che conterrà le righe di testo che compariranno su schermo
     */
    private String schermo[];
    
    /**
     * @author Ballabio Edoardo
     * 
     * Attributo che indica quanti elementi ci sono nell'attributo schermo
     */
    private int elem;
    
    public CDatiCondivisi(int ContDin,int ContDon,int ContDan) {
        this.ContDin = ContDin;
        this.ContDon = ContDon;
        this.ContDan = ContDan;
        schermo = new String[10000];
        for (int i = 0; i < 10000; i++) {
            schermo[i] = "";
        }
    }
    
    /**
     * @author Ballabio Edoardo
     *
     * @brief: Metodo costruttore senza parametri
     *
     * In questo metodo vengono inizializzati a 0 gli attributi ContDin, ContDon, ContDan ed infine elem.
     * Invece le varie posizioni mentre dell'attributo schermo vengono inizializzate a "".
     *
     */
    public CDatiCondivisi() {
        ContDin = 0;
        ContDon = 0;
        ContDan = 0;
        schermo = new String[10000];
        for (int i = 0; i < 10000; i++) {
            schermo[i] = "";
        }
        elem = 0;
    }

    public int getContDin() {
        return ContDin;
    }

    public void setContDin(int ContDin) {
        this.ContDin = ContDin;
    }

    public int getContDon() {
        return ContDon;
    }

    public void setContDon(int ContDon) {
        this.ContDon = ContDon;
    }

    public int getContDan() {
        return ContDan;
    }

    public void setContDan(int ContDan) {
        this.ContDan = ContDan;
    }
    
    /**
     * @author Ballabio Edoardo
     * 
     * @brief: Metodo che si occupa di far visualizzare tutte le righe memorizzate nell'attributo schermo
     * 
     * In questo metodo viene visualizzato a schermo i valori contenuti in tutte le righe dell'attributo schermo
     * fino a quando si arriva al numero di righe salvate nello stesso attributo.
     * 
     */
    public void VisualizzaSchermo() {
        for (int i = 0; i < elem; i++) {
            if (schermo[i].equals("")) {
                i = 10000;
            }
            else {
               System.out.println(schermo[i]);
            }
        }
    }
}
