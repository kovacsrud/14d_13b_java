
public class Nyilvantartas {

	public static void main(String[] args) {
		
		Karbantarto karbantarto=new Karbantarto("Jani bácsi", 1968, "1M", 170000, 1.1);
		
		Kaszkador kaszkador=new Kaszkador("Elek",1989,"kötetlen",350000,1.5);
		
		System.out.println(karbantarto.getNev()+":"+karbantarto.Fizetes());
		System.out.println(kaszkador.getNev()+":"+kaszkador.Fizetes());

	}

}
