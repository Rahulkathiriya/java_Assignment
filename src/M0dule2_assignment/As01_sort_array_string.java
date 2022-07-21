package M0dule2_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class As01_sort_array_string {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array lenght : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int i,j;
		
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index number : ");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.print("Befor sorting array is : ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.print("After sorting array is : ");
		for(i=0;i<n;i++)
		{
			for(j=i;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					arr[i] = arr[i]*arr[j];
					arr[j] = arr[i]/arr[j];
					arr[i] = arr[i]/arr[j];
				}
			}
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println();
		System.out.println("================================================================");
		
	}

}
