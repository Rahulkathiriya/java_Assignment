package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A06_remove_third_element {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Toyota");
		cars.add("Hyundai");
		cars.add("Audi");
		cars.add("Land Rover");
		cars.add("Honda");
		cars.add("Ford");
		cars.add("Range Rover");
		
		Iterator<String> newCars = cars.iterator();
		
		while(newCars.hasNext())
		{
			System.out.println(newCars.next());
		}
		System.out.println();
		System.out.println("======== After Removing Third Element ============");
		System.out.println();
		
		cars.remove(3);
		
		for(String car : cars)
		{
			System.out.println(car);
		}
		
	}

}
