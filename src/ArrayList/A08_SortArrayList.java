package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A08_SortArrayList {

	public static void main(String[] args) {

		ArrayList<String> sorting = new ArrayList<String>();
		
		
		sorting.add("VolksWagen");
		sorting.add("Toyota");
		sorting.add("Porsche");
		sorting.add("Ferrari");
		sorting.add("Mercedes Benz");
		sorting.add("Audi");
		sorting.add("Rolls Roys");
		sorting.add("BMD");
		
		
		System.out.println("Before Sorting the Array list Is : ");
		System.out.println();
		
		for(String sort : sorting)
		{
			System.out.println(sort);
		}
		System.out.println();
		System.out.println("==========================================");
		System.out.println();
		
		Collections.sort(sorting);
		System.out.println("After Sorting the Array list Is : ");
		System.out.println();
		System.out.println(sorting);
		
		
		
		
	}

}
