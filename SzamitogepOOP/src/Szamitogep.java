
public class Szamitogep {

	private double szabadMemoria;
	private boolean bevanKapcsolva;
	
	public Szamitogep(double szabadMemoria, boolean bevanKapcsolva) {
		super();
		this.szabadMemoria = szabadMemoria;
		this.bevanKapcsolva = bevanKapcsolva;
	}
	
	public Szamitogep() {
		
		this.szabadMemoria = 1024;
		this.bevanKapcsolva = false;
	}
	
	public void Kapcsol()
	{
		bevanKapcsolva=!bevanKapcsolva;
	}
	public boolean programMasolas(double programmeret)
	{
		boolean sikeresMasolas=false;
		
		if (szabadMemoria>programmeret && bevanKapcsolva) {
			szabadMemoria-=programmeret;
			sikeresMasolas=true;
		}
		
		
		return sikeresMasolas;
	}
	
	@Override
	public String toString() {
		
		return "A számítógép bekapcsolva:"+bevanKapcsolva+" Szabad memória:"+szabadMemoria;
	}
}
