package ultimacerinta;

public class Application {

	public static void main(String[] args) {
		Coada cod = new Coada(10);
		cod.enqueue(12);
		cod.enqueue(40);
		
		System.out.println(cod.dequeue());

	}

}
