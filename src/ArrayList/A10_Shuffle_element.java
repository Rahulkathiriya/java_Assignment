package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A10_Shuffle_element {

	public static void main(String[] args) {

		ArrayList<String> newArray = new ArrayList<String>();
		
		newArray.add("Java");
		newArray.add(".net");
		newArray.add("Python");
		newArray.add("Php");
		newArray.add("Node");
		
		for(String array : newArray)
		{
			System.out.println(array);
		}
		
		System.out.println("======== After Shuffling ========");
		
		Collections.shuffle(newArray);
		
		for(String Stringarray : newArray)
		{
			System.out.println(Stringarray);
		}
		
	}

}
