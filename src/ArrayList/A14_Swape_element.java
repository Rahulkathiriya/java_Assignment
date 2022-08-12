package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class A14_Swape_element {

	public static void main(String[] args) {

		ArrayList<Integer> swapping = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			System.out.print("Enter Value : ");
			swapping.add(sc.nextInt());
		}
			
		 
		 
		 System.out.println();
		 
		 for(int swap : swapping)
		 {
			 System.out.println(swap);
		 }
		 
		 System.out.println("=== After Swapping value ===");
		 Collections.swap(swapping, 3, 4);
		
		 Iterator<Integer> itr = swapping.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
			 sc.close();
		 
		 
	}

}
