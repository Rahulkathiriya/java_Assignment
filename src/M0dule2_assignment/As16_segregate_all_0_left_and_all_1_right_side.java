package M0dule2_assignment;

import java.util.Scanner;

public class As16_segregate_all_0_left_and_all_1_right_side {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter length of an array : ");
	int n = sc.nextInt();
	
	
	int[] arr = new int [n];
	int count =0;
	
	
	for(int i=0;i<n;i++)
	{
		System.out.print("Enter value for "+(i)+" index position : ");
		arr[i] = sc.nextInt();
	}
		System.out.println();
		System.out.print("Orignal array : ");
		for(int arr1: arr)
		{
			System.out.print(arr1+" ");
		}
		
		System.out.println();
		
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		for(int i=0;i<count;i++)
		{
			arr[i]=0;
		}
		
		for(int i=count;i<n;i++)
		{
			arr[i]=1;
		}
		System.out.print("After segregation array is : ");
		for(int arr1 : arr)
		{
			System.out.print(arr1+" ");
		}
	}

}
