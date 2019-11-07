
public class Kaszkador extends Dolgozo {

	private double berSzorzo;
	private double veszelyessegiPotlek;
	
	public Kaszkador(String nev, int szuletesiEv, String munkarend, double alapber,double berszorzo) {
		super(nev, szuletesiEv, munkarend, alapber);
		this.berSzorzo=berszorzo;
		this.veszelyessegiPotlek=alapber*0.25;
		
	}

	@Override
	public double Fizetes() {
		
		return (getAlapber()*berSzorzo)+veszelyessegiPotlek;
	}
	
	
	
	
}
