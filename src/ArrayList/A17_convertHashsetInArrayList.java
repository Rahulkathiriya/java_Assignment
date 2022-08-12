package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class A17_convertHashsetInArrayList {

	public static void main(String[] args) {

		
		HashSet<String> hset = new HashSet<String>();

		hset.add("nike");
		hset.add("addidas");
		hset.add("jordan");
		hset.add("jockey");
		
		
		System.out.println("Orignal hashSet :  "+hset);
		
		System.out.println();
		System.out.println("Converted Array List : ");
		System.out.println();
		
		ArrayList<String> newList = new ArrayList<String>(hset);
		
		for(String listed : newList)
		{
			System.out.println(listed);
		}
	}

}
