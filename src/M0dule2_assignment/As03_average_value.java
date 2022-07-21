package M0dule2_assignment;

import java.util.Scanner;

public class As03_average_value {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array length : ");
		int n = sc.nextInt();
		
		int[] arr = new int [n];
		
		int i;
		int sum = 0;
		double average;
		
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr[i] = sc.nextInt();
			
		}
		

		for(i=0;i<n;i++)
		{
            sum = sum + arr[i];
		}
		System.out.println();
		System.out.println("Sum of an array is : "+sum);
		
		average = (float) sum/n;
		
		System.out.println("Average of an element is : "+average);
		
		
	}

}
