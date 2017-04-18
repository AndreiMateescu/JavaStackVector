package ultimacerinta;

public class Coada {
	
	public static final int ERROR = Integer.MIN_VALUE;
	
	public int baza;
	private int varf;
	private Array vector;
	
	public Coada(){
		baza = varf = 0;
		vector = new Array();
	}
	
	public Coada(int dim){
		vector = new Array(dim);
	}
	
	public void enqueue(int value){
		vector.transformForInsert();
		vector.set(0,value);
		baza = vector.get(0);
	}
	
	public float dequeue(){
		if(vector.size() != 0){
			float number = vector.get(0);
			vector.transformForDelete();
			return number;
		}
		else
			return ERROR;
	}
	
}
