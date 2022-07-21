package M0dule2_assignment;

import java.util.Scanner;

public class As14_Average_value_except_min_max_value {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of an araay : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr[i] = sc.nextInt();
		}
		
		for(int new_arr :arr )
		{
			System.out.print(new_arr+" ");
		}
		
		System.out.println();
		
		int maximum = arr[0];
		int minimum = arr[0];
		int sum = 0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>maximum)
			{
				maximum = arr[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]< minimum)
			{
				minimum = arr[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			sum = sum + arr[i];
		}
		
		
		double average =(float) ((sum-minimum-maximum)/(n-2));
		System.out.println(average);
	}

}
