package M0dule2_assignment;

import java.util.Scanner;

public class As09_remove_element {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter Arraay length : " );
		int n = sc.nextInt();
		
		
		int arr[] = new int [n];
		
		
	   for(int i=0;i<n;i++)
	   {
		   System.out.print("Enter Value for "+(i)+" index position : ");
		   arr[i] = sc.nextInt();
	   }
	    System.out.println();
	    
		System.out.print("Normal Array is : ");
	   for(int i=0;i<n;i++)
	   {
           System.out.print(arr[i]+" ");
	   }
		
	   System.out.println();
	   System.out.println();
	   
	   System.out.print("Enter index element you want remove : ");
	   int index = sc.nextInt();
	   
	   for(int i=index;i<n-1;i++)
	   {
		   arr[i] = arr[i+1];
	   }
		
	   System.out.print("After removing element the array is : ");

	   for(int i=0;i<n-1;i++)
	   {
		 System.out.print(arr[i]+" ");   
	   }
	}

}
