package Module2_string;

import java.util.Scanner;

public class S07_check_most_frequent_character {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String charString = sc.nextLine();
		
        	char maximum=0;
        	char secMaximum=0;
        	
        	int[] array = new int[200];
		
		for(int i=0;i<charString.length();i++)
		{
			if(charString.charAt(i)!=' ')
			{
				array[charString.charAt(i)]++;
			}
		}
		
		for(int i=0;i<200;i++)
		{
			if(array[i]>array[maximum])
			{
				secMaximum =maximum;
				maximum =(char) i;
			}
			else if(array[i]>array[secMaximum] && array[i]!=array[maximum])
			{
			  secMaximum = (char)i;
			}
		}
		
		System.out.println("The most frequent character in "+charString.toUpperCase()+" is : "+maximum);
		System.out.println("The second most frequent character in "+charString.toUpperCase()+" is : "+secMaximum);
		
	}

}
