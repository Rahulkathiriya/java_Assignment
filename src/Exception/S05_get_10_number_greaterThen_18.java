package Exception;

import java.util.Scanner;

class CheckNumber
{
	public void NumberCheck(int number) throws NumberInvalidException
	{
		
		if(number <10 || number >40)
		{
			throw new NumberInvalidException();
		}
		else
		{
			System.out.println(number);
		}
		
	}
}


public class S05_get_10_number_greaterThen_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter Number : ");
			number[i] = sc.nextInt();
		}
		
		CheckNumber cn = new CheckNumber();
		try {
			for(int i=0;i<10;i++)
			{
			cn.NumberCheck(number[i]);
			
			}
			
		} catch (NumberInvalidException e) {
            e.printStackTrace();
		}
		
	}

}
