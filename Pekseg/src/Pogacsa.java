
public class Pogacsa extends Peksutemeny {

	public Pogacsa(double alapar, double mennyiseg) {
		super(alapar, mennyiseg);
		
	}

	@Override
	public void megKostol() {
		
		this.mennyiseg=this.mennyiseg/2;
		
	}
	
	@Override
	public String toString() {
	
		return "Pogácsa:"+super.toString();
	}
	

}
