package M0dule2_assignment;

import java.util.Scanner;

public class As15_sum_of_10_array_is_30 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of an array : ");
		int n = sc.nextInt();
		
		
		int arr[] = new int[n];
		
		int sum = 0;
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr[i] = sc.nextInt();
		}
		
		for(int new_arr : arr)
		{
			System.out.print(new_arr+" ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
			sum += arr[i];
		}
		
		if(sum == 30)
			
		{
			System.out.println("Condition are ture and sum is : "+sum);
		}
		
		else
		{
			System.out.println("Condition are false because sum is not equal 30..........");
		}
	}

}
