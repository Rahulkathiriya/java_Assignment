package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A03_InserElement_ArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> addElement = new ArrayList<Integer>();
		
		
		addElement.add(12);
		addElement.add(13);
		addElement.add(14);
		addElement.add(15);
		addElement.add(16);
		addElement.add(17);
		addElement.add(18);
		
		addElement.add(0,11);
		addElement.add(8,19);
		addElement.add(9,20);
		   
		Iterator<Integer> element = addElement.iterator();
		
		while(element.hasNext())
		{
			System.out.println(element.next());
		}
	}

}
