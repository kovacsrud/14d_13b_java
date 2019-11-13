
public abstract class Peksutemeny implements Arlap {

	private double alapar;
	protected double mennyiseg;
	
	
	public Peksutemeny(double alapar, double mennyiseg) {
		super();
		this.alapar = alapar;
		this.mennyiseg = mennyiseg;
	}


	public double getAlapar() {
		return alapar;
	}


	public void setAlapar(double alapar) {
		this.alapar = alapar;
	}


	public double getMennyiseg() {
		return mennyiseg;
	}


	public void setMennyiseg(double mennyiseg) {
		this.mennyiseg = mennyiseg;
	}
	
	public abstract void megKostol();
	
	@Override
	public double mennyibeKerul() {
	
		return alapar*mennyiseg;
	}
	
	@Override
	public String toString() {
	
		return "Mennyiség:"+mennyiseg+" db - "+alapar+" Ft";
	}
	
	
}
