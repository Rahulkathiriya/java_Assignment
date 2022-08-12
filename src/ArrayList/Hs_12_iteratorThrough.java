package ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hs_12_iteratorThrough {

	public static void main(String[] args) {

		HashSet<String> hash = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			System.out.print("Enter hashSet String : ");
			hash.add(sc.nextLine());
		}
		
		System.out.println("=====================================");
		
		Iterator<String> itr = hash.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			sc.close();
		
		
	}

}
