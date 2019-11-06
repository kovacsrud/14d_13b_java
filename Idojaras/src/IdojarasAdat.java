
public class IdojarasAdat {
	
	private int ev;
	private int honap;
	private int nap;
	private int ora;
	private double homerseklet;
	private double szelsebesseg;
	private double paratartalom;
	
	public IdojarasAdat(String sor)
	{
		String[] e=sor.split(";");
		ev=Integer.parseInt(e[0]);
		honap=Integer.parseInt(e[1]);
		nap=Integer.parseInt(e[2]);
		ora=Integer.parseInt(e[3]);
		homerseklet=Double.parseDouble(e[4].replace(',', '.'));
		szelsebesseg=Double.parseDouble(e[5].replace(',', '.'));
		paratartalom=Double.parseDouble(e[6].replace(',', '.'));
		
		
	}
	
	
	

	public int getEv() {
		return ev;
	}
	public void setEv(int ev) {
		this.ev = ev;
	}
	public int getHonap() {
		return honap;
	}
	public void setHonap(int honap) {
		this.honap = honap;
	}
	public int getNap() {
		return nap;
	}
	public void setNap(int nap) {
		this.nap = nap;
	}
	public int getOra() {
		return ora;
	}
	public void setOra(int ora) {
		this.ora = ora;
	}
	public double getHomerseklet() {
		return homerseklet;
	}
	public void setHomerseklet(double homerseklet) {
		this.homerseklet = homerseklet;
	}
	public double getSzelsebesseg() {
		return szelsebesseg;
	}
	public void setSzelsebesseg(double szelsebesseg) {
		this.szelsebesseg = szelsebesseg;
	}
	public double getParatartalom() {
		return paratartalom;
	}
	public void setParatartalom(double paratartalom) {
		this.paratartalom = paratartalom;
	}
	
	
	
	
	

}
