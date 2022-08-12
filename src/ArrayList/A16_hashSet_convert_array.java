package ArrayList;

import java.util.HashSet;

public class A16_hashSet_convert_array {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();

		hset.add("nike");
		hset.add("addidas");
		hset.add("jordan");
		hset.add("jockey");

//		for(String newSet : hset)
//		{
		System.out.println("Orignal hashset is : " + hset);
//		}

		String[] newArray = new String[hset.size()];
		hset.toArray(newArray);
		System.out.println();
		System.out.println("After Converting haashset to array : ");
		System.out.println();
		for (String array : newArray) {
			System.out.println(array);
		}

	}

}
