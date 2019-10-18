/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alapok;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author SysAdmin
 */
public class Alapok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //primitív típus
        int a = 10;
        short b = 120;
        long c = 560;

        float d = 156.567f;
        double e = 45.66788;

        boolean logikai = false;

        String szoveg = "Valami szöveg";

        char karakter = 'q';

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        //Tömbök
        int[] szamok=new int[]{1,2,3,4,8,9,10,16,29};
        
        int[][] szamok2d=new int[][]{{1,2,3},{4,5,6,7}};
        
        for (int i = 0; i < szamok.length; i++) {
            System.out.println(szamok[i]);
        }
        
        //Bekérés billentyűzetről
        
//        Scanner be=new Scanner(System.in);
//        
//        //beolvasás string-be
//        String beolvas=be.nextLine();
//        
//        //beolvasás int-be
//        int beszam=be.nextInt();
        
        //tömb min, max
        
        int legkisebb=Arrays.stream(szamok).min().getAsInt();
        int legnagyobb=Arrays.stream(szamok).max().getAsInt();
        
        
        System.out.println(legkisebb+","+legnagyobb);
        
        //Listák (kollekciók)
        
        ArrayList<Integer> szamlista=new ArrayList();
        
        //elemek hozzáadása
        szamlista.add(1);
        szamlista.add(188);
        szamlista.add(216);
        szamlista.add(1025);
        
        //elem lekérése
        szamlista.get(0);
        
        //változtatás egy elemen
        szamlista.set(1, 256);
        
        //lista elemeinek kiírása
        for (Integer i : szamlista) {
            System.out.println(i);
        }
        
        // kezdeti elemek megadása
        ArrayList<Character> betuk=new ArrayList() {{add('a');add(b);}};
        
        //Megadás asList-el
        List<Character> tobbBetu=Arrays.asList('a','b','c','d','e');
        
        
        
        

    }

}
