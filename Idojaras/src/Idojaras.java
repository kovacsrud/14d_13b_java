
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
		
		for (IdojarasAdat i : ev2008) {
			System.out.println(i.getHonap()+","+i.getNap()+","+i.getOra()+","+i.getHomerseklet());
		}
		
		System.out.println("2008 adatai:"+ev2008.size());
		
		//vajon mennyi volt az átlaghõmérséklet 2008-ban?
		
		Double atlagho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).average().getAsDouble();
			
		
		System.out.println("2008 átlaghõmérséklete:"+atlagho08);
		
		//a legnagyobb/legkisebb hõmérséklet 2008-ban?
		
		Double maxho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).max().getAsDouble();
		Double minho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).min().getAsDouble();
		
		System.out.println("2008 max hõmérséklete:"+maxho08);
		System.out.println("2008 min hõmérséklete:"+minho08);
	}

}
