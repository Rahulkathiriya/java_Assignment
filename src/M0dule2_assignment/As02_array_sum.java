package M0dule2_assignment;

import java.util.Scanner;

public class As02_array_sum {

	public static void main(String[] args) {
		
          Scanner sc = new Scanner(System.in);
          
          System.out.print("Enter array length : ");
          int  n = sc.nextInt();
          
          
         int arr[] = new int[n];

         int i;
         int sum= 0;
         
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
		
		
	}
}
