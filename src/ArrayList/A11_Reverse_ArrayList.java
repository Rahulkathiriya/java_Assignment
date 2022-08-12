package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class A11_Reverse_ArrayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.print("Enter Length : ");
		int length = sc.nextInt();
		for(int i=0;i<length;i++)
		{
			System.out.print("Enter List : ");
			list.add(sc.next());
		}
		
		Iterator<String> newList = list.iterator();
		while(newList.hasNext())
		{
			System.out.println(newList.next());
		}
		System.out.println();
		System.out.println("======= Reverse ArrayList =========");
		System.out.println();
		
		Collections.reverse(list);
		
		for(String listOne : list)
		{
			System.out.println(listOne);
		}
		sc.close();
	}

}
