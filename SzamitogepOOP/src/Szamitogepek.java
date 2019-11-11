
public class Szamitogepek {

	public static void main(String[] args) {
		
		Szamitogep gep1=new Szamitogep(2048,false);
		Szamitogep gep2=new Szamitogep();
		
		System.out.println(gep1);
		System.out.println(gep2);
		
		gep2.Kapcsol();
		System.out.println(gep2);
		
		if (gep2.programMasolas(800)) {
			System.out.println("Sikeres másolás!");
		} else {
			System.out.println("Nem sikerült a másolás!");
		}
		System.out.println(gep2);
		if (gep2.programMasolas(400)) {
			System.out.println("Sikeres másolás!");
		} else {
			System.out.println("Nem sikerült a másolás!");
		}

	}

}
