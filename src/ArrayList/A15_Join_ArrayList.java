package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class A15_Join_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter List : ");
			list.add(sc.next());
		}
		System.out.println();
		System.out.println("First ArrayList : ");
		System.out.println();
		for(String newList : list)
		{
			System.out.println(newList);
		}
		System.out.println("===============================================================");
		
		ArrayList<String> list2 = new ArrayList<String>();
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter List : ");
			list2.add(sc.next());
		}
		System.out.println();
		System.out.println("Second ArrayList : ");
		System.out.println();
		for(String newList2 : list2)
		{
			System.out.println(newList2);
		}
		
		list.addAll(list2);
		
		System.out.println();
		System.out.println("Join both ArrayList : ");
		System.out.println();
		for(String newList : list)
		{
			System.out.println(newList);
		}
		
		
		sc.close();
 
	}

}
