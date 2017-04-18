
public class Muncitor extends Angajat{

	private int salariu;
	
	public Muncitor(){
		salariu = 0;
	}
	
	public Muncitor(int s){
		this.salariu = s;
	}

	@Override
	public String toString() {
		return "Muncitor [salariu=" + salariu + "]";
	}
	
	
}
