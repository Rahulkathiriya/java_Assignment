package M0dule2_assignment;

import java.util.Scanner;

public class As08_insert_element_speific_position {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of an array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" inex position : ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("Normal array is : ");
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println();

		System.out.print("Enter index position : ");
		int index = sc.nextInt();
		   
		System.out.print("Enter element you want add : ");
		int element = sc.nextInt();
		
		
		for(int i = n-1;i > index-1;i-- )
		{
			arr[i] = arr[i-1];
		}
		
		arr[index] = element;
		
		System.out.print("After adding element the array is : ");
		for(int new_arr :arr)
		{
			System.out.print(new_arr+" ");
		}
	}

}
