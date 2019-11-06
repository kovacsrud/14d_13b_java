import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
		
		
	}

}
