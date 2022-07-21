package M0dule2_assignment;

import java.util.Scanner;

public class As10_reverse_array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array length : ");
		int n = sc.nextInt();
		
		int arr[] = new int [n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.print("Normal array : ");
		
		for(int arr1 : arr)
		{
			System.out.print(arr1+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				arr[i] = arr[i]*arr[j];
				arr[j] = arr[i]/arr[j];
				arr[i] = arr[i]/arr[j];
			}
		}
		System.out.println();
		System.out.print("Reverce array is : ");
		for(int arr2 : arr)
		{
			System.out.print(arr2+" ");
		}
	}

}
