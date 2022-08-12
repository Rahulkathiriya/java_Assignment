package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A05_updateSpacificArrayElement {

	public static void main(String[] args) {

		ArrayList<String> newArray = new ArrayList<String>();
		
		
		newArray.add("Orange");
		newArray.add("Yellow");
		newArray.add("Black");
		newArray.add("White");
		newArray.add("Green");
		newArray.add("Pink");
		
		Iterator<String> color = newArray.iterator();
		
		while(color.hasNext())
		{
			System.out.println(color.next());
		}
		System.out.println();
		System.out.println("======== After Changing specific array element ========");
        System.out.println();
		newArray.set(0, "Aqua");
		newArray.set(5,"Blue");
		
		for(String newColor : newArray)
		{
			System.out.println(newColor);
		}
		
		
	}

}
