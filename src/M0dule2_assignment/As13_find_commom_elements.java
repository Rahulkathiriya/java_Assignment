package M0dule2_assignment;

import java.util.Scanner;

public class As13_find_commom_elements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of an araay : ");
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr1[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter second array value");
		System.out.println();
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr2[i] = sc.nextInt();
		}
		System.out.print("Arr1 is : ");
		
		for(int new_arr1 : arr1)
		{
			System.out.print(new_arr1+" ");
		}
		
		System.out.println();
		
		System.out.print("Arr2 is : ");
		
		for(int new_arr2 : arr2)
		{
			System.out.print(new_arr2+" ");
		}
		System.out.println();
		
		System.out.print("comon elements of in both array is : ");
		for(int i=0;i<n;i++)
			
			for(int j=0;j<n;j++)
		{
			if(arr1[i] == arr2[j])
			{
				System.out.print(arr1[i]+" ");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
