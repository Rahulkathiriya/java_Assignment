package ArrayList;

import java.util.HashSet;

public class A19_compaireSetAndRetain {

	public static void main(String[] args) {

		
		HashSet<String> set = new HashSet<String>();
		
		 set.add("Red");
         set.add("Green");
         set.add("Black");
         set.add("White");
         
         System.out.println("First hashSet is : "+set);
         
         HashSet<String> set2 = new HashSet<String>();
         
         set2.add("Red");
         set2.add("orenge");
         set2.add("Black");
         set2.add("Yellow");
         
         System.out.println();
         System.out.println("Second hashSet is : "+set2);
         
         set.retainAll(set2);
         System.out.println();
         System.out.println("Same Element in both set is : "+set);
         
	}

}
