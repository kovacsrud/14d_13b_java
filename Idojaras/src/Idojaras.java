
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
		
		for (IdojarasAdat i : ev2008) {
			System.out.println(i.getHonap()+","+i.getNap()+","+i.getOra()+","+i.getHomerseklet());
		}
		
		System.out.println("2008 adatai:"+ev2008.size());
		
		//vajon mennyi volt az �tlagh�m�rs�klet 2008-ban?
		
		Double atlagho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).average().getAsDouble();
			
		
		System.out.println("2008 �tlagh�m�rs�klete:"+atlagho08);
		
		//a legnagyobb/legkisebb h�m�rs�klet 2008-ban?
		
		Double maxho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).max().getAsDouble();
		Double minho08=ev2008.stream().mapToDouble(x->x.getHomerseklet()).min().getAsDouble();
		
		System.out.println("2008 max h�m�rs�klete:"+maxho08);
		System.out.println("2008 min h�m�rs�klete:"+minho08);
	}

}
