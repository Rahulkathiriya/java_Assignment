package M0dule2_assignment;

import java.util.Scanner;

public class As11_find_duplicate_value {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter arrar length : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for "+(i)+" index position : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate value is : "+arr[i]);
				}
			}
		}
		
	}

}
