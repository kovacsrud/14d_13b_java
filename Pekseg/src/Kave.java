
public class Kave implements Arlap {

	private boolean habosE;

	public Kave(boolean habosE) {
		super();
		this.habosE = habosE;
	}

	@Override
	public double mennyibeKerul() {
		
		if (habosE) {
			return CSESZEKAVE*1.5;
		} else {
			return CSESZEKAVE;
		}
		
	}
	
	@Override
	public String toString() {
		
		String vissza="";
		
		if (habosE) {
			vissza=vissza+"Habos"+mennyibeKerul();
		} else {
			vissza=vissza+"Nem habos"+mennyibeKerul();
		}
		
		
		return vissza;
	}
	
	
}
