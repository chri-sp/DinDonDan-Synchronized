/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.concurrent.Semaphore;


public class DatiCondivisi {

    int contaDIN=0,contaDON=0,contaDAN=0;
    
    int maxElem=10000000;
    String schermo[];
    int p;
    
    private Semaphore semDIN;
    private Semaphore semDON;
    private Semaphore semDAN;

    public DatiCondivisi() {
        this.schermo=new String [maxElem];
        this.p=0;
        
        semDIN = new Semaphore(0);
        semDON = new Semaphore(0);
        semDAN = new Semaphore(0);
    }

    public DatiCondivisi(int contaDIN, int contaDON, int contaDAN) {
        this.contaDIN = contaDIN;
        this.contaDON = contaDON;
        this.contaDAN = contaDAN;
        this.schermo=new String [maxElem];
        this.p=0;
        
        
    }
    
    public void WaitDIN() throws InterruptedException {
        semDIN.acquire();
    }
    
    public void WaitDON() throws InterruptedException {
        semDON.acquire();
    }
    
    public void WaitDAN() throws InterruptedException {
        semDAN.acquire();
    }
    
    public void SignalDIN() {
        semDIN.release();
    }
    
    public void SignalDON() {
        semDON.release();
    }
    
    public void SignalDAN() {
        semDAN.release();
    }

    public synchronized int getContaDIN() {
        return contaDIN;
    }

    public synchronized void setContaDIN(int contaDIN) {
        this.contaDIN = contaDIN;
    }

    public synchronized int getContaDON() {
        return contaDON;
    }

    public synchronized void setContaDON(int contaDON) {
        this.contaDON = contaDON;
    }

    public synchronized int getContaDAN() {
        return contaDAN;
    }

    public synchronized void setContaDAN(int contaDAN) {
        this.contaDAN = contaDAN;
    }
    
    
    
  
    public synchronized String verificaSeHaiVinto(int c) {
        String x="Hai Perso";
        if(c==1 && contaDIN>contaDON && contaDIN>contaDAN) {
            x="Hai Vinto!";
        }
        if(c==2 && contaDON>contaDIN && contaDON>contaDAN) {
            x="Hai Vinto!";
        }
        if(c==3 && contaDAN>contaDON && contaDAN>contaDON) {
            x="Hai Vinto!";
        }
        return x;
    }
    public synchronized void aggiungi(String x) {
        if (p >= maxElem)
            p = 0;
        schermo[p]=x;
        p+=1;
    }
    public synchronized void printSchermo() {
        System.out.println("-------------------------------");
        for (int i = 0; i < p; i ++) {
            System.out.print(schermo[i] + " ");
            if (i % 20 == 19)
                System.out.println("");
        }
        System.out.println("\n-------------------------------");
    }
}
