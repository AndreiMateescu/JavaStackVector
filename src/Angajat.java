
public class Angajat {
	private String name;

	@Override
	public String toString() {
		return "Angajat [Nume=" + name + "]";
	}
	
	public Angajat(){
		name = "";
	}
	
	public Angajat(String s){
		this.name = s;
	}
}
