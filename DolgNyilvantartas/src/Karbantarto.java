
public class Karbantarto extends Dolgozo {
	
	private double berSzorzo;
	
	public Karbantarto(String nev, int szuletesiEv, String munkarend, double alapber,double berszorzo) {
		super(nev, szuletesiEv, munkarend, alapber);
		this.berSzorzo=berszorzo;
	}

	@Override
	public double Fizetes() {
		 
		return getAlapber()*berSzorzo;
	}

	
	
	
	
}
