package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A02_iterate_through_calling {

	public static void main(String[] args) {

		
		ArrayList itrateeType = new ArrayList<>();
		

		itrateeType.add("Rahul kathiriya");
		itrateeType.add(007);
		itrateeType.add(99.99);
		itrateeType.add('R');
		itrateeType.add(true);
		
		Iterator newItr = itrateeType.iterator();
		
		
		while(newItr.hasNext())
		{
			System.out.println(newItr.next());
		}
		
		
		
	}

}
