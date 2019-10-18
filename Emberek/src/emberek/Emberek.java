/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emberek;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author SysAdmin
 */
public class Emberek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ember elek=new Ember("Elek",1999,175,79);
        Ember zeno=new Ember("Zénó",1991,179,86);
        Ember gerzson=new Ember("Gerzson",2006,185,110);
        Ember zente=new Ember("Zente",2007,169,61);
        
        List<Ember> emberek=new ArrayList();
        
        emberek.add(elek);
        emberek.add(zeno);
        emberek.add(gerzson);
        emberek.add(zente);
        
        System.out.println("Emberek száma:"+emberek.size());
        
        for (Ember e : emberek) {
            System.out.println(e.getNev()+","+e.getMagassag()+","+e.getSuly()+","+e.getSzulEv());
        }
        
        //Adott feltétel(ek)-nek megfelelő emberek kiszűrése?
        
        List ketezerUtan=emberek.stream().filter(x->x.getSzulEv()>2000).collect(Collectors.toList());
        
        System.out.println("");
        for (Object o : ketezerUtan) {
            Ember e=(Ember)o;
            System.out.println(e.getNev()+","+e.getSzulEv());
        }
        
        
        
        
    }
    
}
