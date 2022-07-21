package M0dule2_assignment;

import java.util.Scanner;

public class As06_min_max_value {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array value : ");
		int n = sc.nextInt();
		
		
		int[] arr = new int[n];
		int  i;
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr[i] = sc.nextInt();
		}
		
		int minimum = arr[0];
		int maximum = arr[0];
		for(i=0;i<n;i++)
		{
			if(arr[i]< minimum)
			{
				minimum = arr[i];
			}
			else if(arr[i]>maximum)
			{
				maximum = arr[i];
			}
		}
		System.out.println("Minimum value of an array is : "+minimum);
		System.out.println("Maximum value of an array is : "+maximum);

	}

}
