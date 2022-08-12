package ArrayList;

import java.util.HashMap;

public class A20_CollectionsOfView {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Rahul");
		map.put(2, "Ravi");
		map.put(3, "Ram");
		map.put(4, "Rakul");
		
		
		System.out.println("Collection view is : "+map.values());
		
	}

}
