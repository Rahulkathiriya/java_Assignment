package M0dule2_assignment;

import java.util.Scanner;

public class As04_element_position {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array length : ");
		int n= sc.nextInt();
		
		int[] arr = new int[n];
		
		int i;
		int element=1;
		int flag =0;
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.print("Enter element you want : ");
		element= sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i]==element)
			{
				flag=1;
			}
		}
		System.out.println();
		
		if(flag==1)
		{
			System.out.println(element+" Element is find in index position");
		}
		else
		{
			System.out.println(element+"element is not find any index position ");
		}
		
	}

}
