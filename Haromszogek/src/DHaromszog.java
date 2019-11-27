
public class DHaromszog {

	private double aOldal;
	private double bOldal;
	private double cOldal;
	private int sorszam;
	
	public DHaromszog(String sor,int sorszam) throws NumberFormatException, HaromszogHiba {
		String[] oldalak=sor.split("\\s");
		setSorszam(sorszam);
		setaOldal(Double.parseDouble(oldalak[0]));
		setbOldal(Double.parseDouble(oldalak[1]));
		setcOldal(Double.parseDouble(oldalak[2]));
		
		if (!EllDerekszogu()) {
			throw new HaromszogHiba("Ez nem derékszögû!");
		}
		if (!EllMegszerkesztheto()) {
			throw new HaromszogHiba("Ez nem megszerkeszthetõ!");
		}
		if (!EllNovekvoSorrend()) {
			throw new HaromszogHiba("Az oldalak nincsenek növekvõ sorrendben");
		}
		
		
	}
	
	public int getSorszam() {
		return sorszam;
	}
	public void setSorszam(int sorszam) {
		this.sorszam = sorszam;
	}
	public double getaOldal() {
		return aOldal;
	}
	public void setaOldal(double aOldal) throws HaromszogHiba {
		if (aOldal>0) {
			this.aOldal = aOldal;
		} else {
			throw new HaromszogHiba("A a oldal nem lehet 0!");
		}
		
	}
	public double getbOldal() {
		return bOldal;
	}
	public void setbOldal(double bOldal) throws HaromszogHiba {
		if (bOldal>0) {
			this.bOldal = bOldal;
		} else {
			throw new HaromszogHiba("A b oldal nem lehet 0!");
		}
		
	}
	public double getcOldal() {
		return cOldal;
	}
	public void setcOldal(double cOldal) throws HaromszogHiba {
		if (cOldal>0) {
			this.cOldal = cOldal;
		} else {
			throw new HaromszogHiba("A c oldal nem lehet 0!");
		}
		
	}
	public boolean EllDerekszogu()
	{
		boolean derekszogu=false;
		if (Math.pow(cOldal, 2)==Math.pow(aOldal, 2)+Math.pow(bOldal, 2)) {
			derekszogu=true;
		}
		return derekszogu;
	}
	
	public boolean EllMegszerkesztheto()
	{
		boolean megszerkesztheto=false;
		
		if ((aOldal+bOldal)>cOldal) {
			megszerkesztheto=true;
		}
		
		return megszerkesztheto;
	}
	public boolean EllNovekvoSorrend()
	{
		boolean novekvo=false;
		if (aOldal<=bOldal && bOldal<=cOldal) {
			novekvo=true;
		}
		return novekvo;
	}
	public double Kerulet()
	{
		return aOldal+bOldal+cOldal;
	}
	public double Terulet()
	{
		return (aOldal*bOldal)/2;
	}
}
