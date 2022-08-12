package ArrayList;

import java.util.ArrayList;

public class A01_StringArrayList {

	public static void main(String[] args) {

		ArrayList<String> colorString = new ArrayList<>();
		
		colorString.add("Black");
		colorString.add("Red");
		colorString.add("Green");
		colorString.add("Yellow");
		colorString.add("Orenge");
		colorString.add(1,"White");
		colorString.set(2, "offWhite");                    //  change at any index value  using -->[.set]
		
		for(String newColor : colorString)
		{
			System.out.println(newColor);
		}
		
		
	}

}
