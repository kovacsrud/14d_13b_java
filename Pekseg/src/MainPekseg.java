import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainPekseg {

	public static void main(String[] args) {
		
		List<Arlap> pekseg=new ArrayList<Arlap>();
		
		List<String> fajlSorok=Collections.emptyList();
		
		try {
			fajlSorok=Files.readAllLines(Paths.get("c:/ftproot/pekseg/peksegadatok.txt"));
			
			for (int i = 0; i < fajlSorok.size(); i++) {
				String[] e=fajlSorok.get(i).split("\\s");
				if (e[0].equals("Pogacsa")) {
					Pogacsa pogacsa=new Pogacsa(Double.parseDouble(e[1]),Double.parseDouble(e[2]));
					pekseg.add(pogacsa);
				} else {
					if (e[1].equals("habos")) {
						
						Kave kave=new Kave(true);
						pekseg.add(kave);
						
					} else {
						Kave kave=new Kave(false);
						pekseg.add(kave);
					}
				}
			}
			
			System.out.println("Feldolgozás vége.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(pekseg.size());
		
		for (Arlap a : pekseg) {
			
			//System.out.println(a.getClass().getName());
			if (a.getClass().getName()=="Pogacsa") {
				Pogacsa p=(Pogacsa)a;
				System.out.println(p.getAlapar()+";"+p.getMennyiseg()+";"+p.mennyibeKerul());
			} else {
				Kave k=(Kave)a;
				System.out.println(k);
			}
			
		}
		for (Object o : pekseg) {
			if (o instanceof Pogacsa) {
				Pogacsa p=(Pogacsa)o;
				System.out.println(p.getAlapar()+";"+p.getMennyiseg()+";"+p.mennyibeKerul());
			}
		}
	}

}
