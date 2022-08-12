package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class A12_Extraxt_portion {

	public static void main(String[] args) {

		ArrayList<String> firstList = new ArrayList<String>();

		firstList.add("First");
		firstList.add("Second");
		firstList.add("Third");
		firstList.add("Fourth");
		firstList.add("Fifth");

		for (String list : firstList) {
			System.out.println(list);
		}
		System.out.println("=======================================");
		List<String> newList = firstList.subList(0, 3);

		for (String listed : newList) {
			System.out.println(listed);
		}

	}

}
