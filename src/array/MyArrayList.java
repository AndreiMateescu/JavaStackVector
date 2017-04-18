package array;

import java.util.Arrays;

import com.sun.media.sound.SoftSynthesizer;

public class MyArrayList {
	
	private float myArray[];
	private int dimension;
	public int reverse = 0;
	
	public MyArrayList(){
		myArray = new float[10];
		dimension = myArray.length;
	}
	
	public MyArrayList(int dim){
		myArray = new float[dim];
		dimension = dim;
	}
	
	public void add(float value){
		if(reverse < myArray.length){
			myArray[reverse] = value;
			reverse++;
		}
		else{
			float aux[] = new float[myArray.length];
			for(int i = 0;i<aux.length;i++)
				aux[i] = myArray[i];
			
			myArray = new float[2*myArray.length];
			for(int i=0;i<aux.length;i++)
				myArray[i] = aux[i];
			
			myArray[reverse] = value;
			reverse++;
			
		}
	}
	
	public boolean contains(float value){
		for (float f : myArray) {
			if (f == value)
				return true;
		}
		return false;
	}
	
	public void remove(int index){
		if (index < myArray.length && index <= reverse){
			for(int i=index;i<myArray.length-1;i++){
				myArray[i] = myArray[i+1];
			}
			reverse--;
			add(0);
		}
		else
			System.out.println("Impossible");
	}
	
	public float get(int index){
		return myArray[index];
	}
	
	public int size(){
		return myArray.length;
	}
	
	public void show(){
		for (float f : myArray) {
			System.out.println(f);
		}
	}

	@Override
	public String toString() {
		return "MyArrayList [myArray=" + Arrays.toString(myArray) + "]";
	}
	
	
}
