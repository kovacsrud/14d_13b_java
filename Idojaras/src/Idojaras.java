
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
		
		//Feladat:idojaras.csv betöltése, feldolgozása
		//adatok visszakeresése a lehetõ legegyszerûbb
		//módon
		
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
		
		System.out.println("Adatok száma"+idojarasAdatok.size());
		
		//Adatok visszanyerése
		//pl. nyerjük vissza a 2008-as év adatait
		
		List<IdojarasAdat> ev2008=idojarasAdatok.stream().filter(x->x.getEv()==2008).collect(Collectors.toList());
		
		//for (IdojarasAdat i : ev2008) {
		//	System.out.println(i.getHonap()+","+i.getNap()+","+i.getOra()+","+i.getHomerseklet());
		//}
		
		System.out.println("2008 adatai:"+ev2008.size());
		
		//vajon mennyi volt az átlaghõmérséklet 2008-ban?
		
		Double atlagho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).average().getAsDouble();
			
		
		System.out.println("2008 átlaghõmérséklete:"+atlagho08);
		
		//a legnagyobb/legkisebb hõmérséklet 2008-ban?
		
		Double maxho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).max().getAsDouble();
		Double minho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).min().getAsDouble();
		
		System.out.println("2008 max hõmérséklete:"+maxho08);
		System.out.println("2008 min hõmérséklete:"+minho08);
		
		//Melyik napon volt a legmelegebb óra? (év, hó, nap)
		
		Double maxho=idojarasAdatok.stream().mapToDouble(x->x.getHomerseklet()).max().getAsDouble();
		
		IdojarasAdat legmelegebb=idojarasAdatok.stream().filter(x->x.getHomerseklet()==maxho).findFirst().get();
		
		System.out.println(legmelegebb.getEv()+","+legmelegebb.getHonap()+","+legmelegebb.getNap()+","+legmelegebb.getOra()+","+legmelegebb.getHomerseklet());
		
		List<IdojarasAdat> legmelegebbek=idojarasAdatok.stream().filter(x->x.getHomerseklet()==maxho).collect(Collectors.toList());
		
		System.out.println(legmelegebbek.size());
		
		Double minho=idojarasAdatok.stream().mapToDouble(x->x.getHomerseklet()).min().getAsDouble();
		
		IdojarasAdat leghidegebb=idojarasAdatok.stream().filter(x->x.getHomerseklet()==minho).findFirst().get();
		
		System.out.println(leghidegebb.getEv()+","+leghidegebb.getHonap()+","+leghidegebb.getNap()+","+leghidegebb.getOra()+","+leghidegebb.getHomerseklet());
		
		//a 2008-as adatokat írassuk fájlba
		
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
			System.out.println("Kiírás kész!");
			
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
