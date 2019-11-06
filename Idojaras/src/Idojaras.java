
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Idojaras {

	public static void main(String[] args) {
		
		//Feladat:idojaras.csv bet�lt�se, feldolgoz�sa
		//adatok visszakeres�se a lehet� legegyszer�bb
		//m�don
		
		File fajl=new File("d:/rud/idojaras.csv");
		List<IdojarasAdat> idojarasAdatok=new ArrayList<IdojarasAdat>();	
		
		try {
			Scanner scan=new Scanner(fajl);
			
			scan.nextLine();
			
			while (scan.hasNextLine()) {
				IdojarasAdat idojarasadat=new IdojarasAdat(scan.nextLine());
				
				idojarasAdatok.add(idojarasadat);
			}
			scan.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Adatok sz�ma"+idojarasAdatok.size());
		
		//Adatok visszanyer�se
		//pl. nyerj�k vissza a 2008-as �v adatait
		
		List<IdojarasAdat> ev2008=idojarasAdatok.stream().filter(x->x.getEv()==2008).collect(Collectors.toList());
		
		//for (IdojarasAdat i : ev2008) {
		//	System.out.println(i.getHonap()+","+i.getNap()+","+i.getOra()+","+i.getHomerseklet());
		//}
		
		System.out.println("2008 adatai:"+ev2008.size());
		
		//vajon mennyi volt az �tlagh�m�rs�klet 2008-ban?
		
		Double atlagho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).average().getAsDouble();
			
		
		System.out.println("2008 �tlagh�m�rs�klete:"+atlagho08);
		
		//a legnagyobb/legkisebb h�m�rs�klet 2008-ban?
		
		Double maxho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).max().getAsDouble();
		Double minho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).min().getAsDouble();
		
		System.out.println("2008 max h�m�rs�klete:"+maxho08);
		System.out.println("2008 min h�m�rs�klete:"+minho08);
		
		//Melyik napon volt a legmelegebb �ra? (�v, h�, nap)
		
		Double maxho=idojarasAdatok.stream().mapToDouble(x->x.getHomerseklet()).max().getAsDouble();
		
		IdojarasAdat legmelegebb=idojarasAdatok.stream().filter(x->x.getHomerseklet()==maxho).findFirst().get();
		
		System.out.println(legmelegebb.getEv()+","+legmelegebb.getHonap()+","+legmelegebb.getNap()+","+legmelegebb.getOra()+","+legmelegebb.getHomerseklet());
		
		List<IdojarasAdat> legmelegebbek=idojarasAdatok.stream().filter(x->x.getHomerseklet()==maxho).collect(Collectors.toList());
		
		System.out.println(legmelegebbek.size());
		
		Double minho=idojarasAdatok.stream().mapToDouble(x->x.getHomerseklet()).min().getAsDouble();
		
		IdojarasAdat leghidegebb=idojarasAdatok.stream().filter(x->x.getHomerseklet()==minho).findFirst().get();
		
		System.out.println(leghidegebb.getEv()+","+leghidegebb.getHonap()+","+leghidegebb.getNap()+","+leghidegebb.getOra()+","+leghidegebb.getHomerseklet());
		
		//a 2008-as adatokat �rassuk f�jlba
		
		File outFajl=new File("d:/rud/ev2008.txt");
		
		try {
			BufferedWriter wr=new BufferedWriter(new FileWriter(outFajl));
			
			for (IdojarasAdat i : ev2008) {
				wr.write(i.getEv()+
						";"+i.getHonap()+
						";"+i.getNap()+
						";"+i.getOra()+
						";"+i.getHomerseklet()+
						";"+i.getSzelsebesseg()+
						";"+i.getParatartalom());
				wr.newLine();
			}
			wr.close();
			System.out.println("Ki�r�s k�sz!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SortedSet<Integer> halmaz=new TreeSet<>();
		
		halmaz.add(5);
		halmaz.add(1);
		halmaz.add(2);
		halmaz.add(1);
		halmaz.add(1);
		halmaz.add(4);
		halmaz.add(3);
		halmaz.add(3);
		
		
		
		System.out.println(halmaz);
		System.out.println(halmaz.size());
	}

}
