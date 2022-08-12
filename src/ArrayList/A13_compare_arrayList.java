package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class A13_compare_arrayList {

	public static void main(String[] args) {

		ArrayList<String> List = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length : ");
		int length = sc.nextInt();

		for (int i = 0; i < length; i++) {
			System.out.print("Enter Array List : ");
			List.add(sc.next());
		}

		System.out.println("===================================");

		ArrayList<String> secondList = new ArrayList<String>();

		for (int i = 0; i < length; i++) {
			System.out.print("Enter second Array List : ");
			secondList.add(sc.next());
		}

		System.out.println();

		Iterator<String> newList = List.iterator();

		while (newList.hasNext()) {
			System.out.print(newList.next() + " ");
		}
		System.out.println();
		System.out.println();

		Iterator<String> newsList = secondList.iterator();

		while (newsList.hasNext()) {
			System.out.print(newsList.next() + " ");
		}
		System.out.println();
		System.out.println();

		if (List.equals(secondList)) {
			System.out.println("Enter Both ArrayList are Same...");
		} else {
			System.out.println("Enter both String are Different");
		}

		sc.close();
	}

}
