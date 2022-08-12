package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class A07_SearchElementInArrayList {

	public static void main(String[] args) {

		
		ArrayList<String> element = new ArrayList<String>();
		
		
		element.add("Rahul");
		element.add("Ravi");
		element.add("Ram");
		element.add("Krishna");
		element.add("Sudama");
		element.add("Hanuman");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Element you want to search index or name : ");
		String name = sc.next();
		
		int elements = element.indexOf(name);
		
		if(element.contains(name))
		{
			System.out.println(name+" found at "+elements+" idex Position");
		}
		
		else
		{
			System.out.println("There is no such element");
		}

		
		sc.close();
		
	}

}
