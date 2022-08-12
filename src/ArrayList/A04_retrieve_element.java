package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class A04_retrieve_element {

	public static void main(String[] args) {

		
		
		ArrayList<String> subName = new ArrayList<String>();
		
		subName.add("Rahul kathiriya");
		subName.add("Ravi patel");
		subName.add("RK");
		subName.add("Mahadev");
		
		
		
		Iterator<String> itr = subName.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("==============================================");
		System.out.println();
		System.out.println("The element of index 2 in the Array list is : "+subName.get(2));
	}

}
