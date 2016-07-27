/**
 * 
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uditgupta
 * Jul 3, 2016 11:36:11 PM
 */
public class GenericsBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ArrayList<Dog> d1 = new ArrayList<Animal>();
		
		//ArrayList<Animal> d2 = new ArrayList<Dog>();
		
		List<Animal> d3 = new ArrayList<Animal>();
		
		ArrayList<Dog> d4 = new ArrayList<Dog>();
		
		//ArrayList<Animal> d5 = d4;
		
		List<Dog> d6 = d4;
		
		ArrayList<Object> d7 = new ArrayList<Object>();
		
		List<Object> d8 = d7;
		
		//ArrayList<Object> d9 = new ArrayList<Dog>();
	}
	
	public <T extends Animal> void takeThing(ArrayList<T> list){
		
	}

}
class Animal{
	int n;
	
}
class Dog extends Animal{
	int n;
}