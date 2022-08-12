package ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hs_13_getNumberElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		HashSet<String> element = new HashSet<String>();
		
		element.add("Hyundai");
		element.add("Toyota");
		element.add("Ford");
		element.add("Audi");
		element.add("BMW");
		element.add("Land rover");
		element.add("Porsche");
		
		Iterator<String> cars = element.iterator();
		
		while(cars.hasNext())
		{
			System.out.println(cars.next());
		}
		
		System.out.println("===================================");
		System.out.println();
		System.out.println("Number of element is :  "+element.size());
		
	
			sc.close();
		
		
	}

}
