package ArrayList;

import java.util.HashSet;

public class Hs_11_Hashset_Element {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("python");
		set.add("php");
		set.add(".net");
		set.add("java");
		set.add("android");
		set.add("react");
		
		for(String sset : set)
		{
			System.out.println(sset);
			
			
		}
		
	}

}
