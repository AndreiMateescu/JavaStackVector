package array;

public class Application {

	public static void main(String[] args) {
		
		MyArrayList obiect = new MyArrayList(5);
		obiect.add(6);
		obiect.add(12);
		obiect.add(20);
		obiect.add(11);
		obiect.add(100);
		obiect.add(96);
		obiect.add(98);
		obiect.add(55);
		obiect.add(99);
		obiect.add(2006);
		obiect.remove(2);
		System.out.println(obiect);
		
	}

}
