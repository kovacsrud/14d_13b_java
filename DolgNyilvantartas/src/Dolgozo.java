
public abstract class Dolgozo {
	private String nev;
	private int szuletesiEv;
	private String munkarend;
	private double alapber;
	
	
	public Dolgozo(String nev, int szuletesiEv, String munkarend, double alapber) {
		super();
		this.nev = nev;
		this.szuletesiEv = szuletesiEv;
		this.munkarend = munkarend;
		this.alapber = alapber;
	}
	
	public abstract double Fizetes();
	
	
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public int getSzuletesiEv() {
		return szuletesiEv;
	}
	public void setSzuletesiEv(int szuletesiEv) {
		this.szuletesiEv = szuletesiEv;
	}
	public String getMunkarend() {
		return munkarend;
	}
	public void setMunkarend(String munkarend) {
		this.munkarend = munkarend;
	}
	public double getAlapber() {
		return alapber;
	}
	public void setAlapber(double alapber) {
		this.alapber = alapber;
	}
	
	
}
