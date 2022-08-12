package ArrayList;

import java.util.ArrayList;

public class A18_printListUsingIndexNumber {

	public static void main(String[] args) {

		
		 ArrayList <String> list = new ArrayList <String> ();
		  list.add("Red");
		  list.add("Green");
		  list.add("Black");
		  list.add("White");
		  list.add("Pink");
		  
		  System.out.println("Array List using variable : "+list);
		  
		  int indexNumber = list.size();
		  
		  for(int i=0;i< indexNumber;i++)
		  {
			  System.out.println(list.get(i));
		  }
	}

}
