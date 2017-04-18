
public class Director extends Angajat{

	private String departament;
	
	public Director(){
		departament = "";
	}
	
	public Director(String s){
		this.departament = s;
	}

	@Override
	public String toString() {
		return "Director [departament=" + departament + "]";
	}
	
	
}
