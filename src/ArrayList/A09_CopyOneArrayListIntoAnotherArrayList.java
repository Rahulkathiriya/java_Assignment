package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A09_CopyOneArrayListIntoAnotherArrayList {

	public static void main(String[] args) {

		
		ArrayList<Integer> adding = new ArrayList<Integer>();
		
		adding.add(1);
		adding.add(2);
		adding.add(3);
		adding.add(4);
		adding.add(5);
		
		ArrayList<Integer> adding2 = new ArrayList<Integer>();
		
		adding2.addAll(adding);		
		adding2.add(6);
		adding2.add(7);
		adding2.add(8);
		adding2.add(9);
		adding2.add(10);
		
		Iterator<Integer> itr = adding2.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
