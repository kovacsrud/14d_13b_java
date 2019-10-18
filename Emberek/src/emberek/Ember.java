/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emberek;

/**
 *
 * @author SysAdmin
 */
public class Ember {
    
    private String nev;
    private int szulEv;
    private int magassag;
    private int suly;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzulEv() {
        return szulEv;
    }

    public void setSzulEv(int szulEv) {
        this.szulEv = szulEv;
    }

    public int getMagassag() {
        return magassag;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag;
    }

    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }

    public Ember(String nev, int szulEv, int magassag, int suly) {
        this.nev = nev;
        this.szulEv = szulEv;
        this.magassag = magassag;
        this.suly = suly;
    }
    
    
    
}
