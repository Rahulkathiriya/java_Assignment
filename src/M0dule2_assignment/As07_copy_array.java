package M0dule2_assignment;

import java.util.Scanner;

public class As07_copy_array {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array length : ");
		int n = sc.nextInt();
		
		
		int[] arr1 = new int [n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[arr1.length + arr2.length];
		
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr1[i] = sc.nextInt();
		}
		
		
		
        System.out.println();
        System.out.println();
        
        
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr2[i] = sc.nextInt();
		}
		
		   System.out.println();
	       System.out.println();
	        
		System.out.print("First array is : ");
		for(int new_arr1 : arr1)
		{
			System.out.print(new_arr1+" ");
		}
		
		System.out.println();
		
		System.out.print("Second array is : ");		
		
		for(int new_arr2 : arr2)
		{
			System.out.print(new_arr2+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i] = arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			arr3[arr1.length+i] = arr2[i];
		}
		
		System.out.print("After adding two array : ");
		for(int new_arr : arr3)
		{
			System.out.print(new_arr+" ");
		}
			
		
	}

}
