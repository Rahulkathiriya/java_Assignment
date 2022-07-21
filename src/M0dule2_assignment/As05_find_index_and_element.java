package M0dule2_assignment;

import java.util.Scanner;

public class As05_find_index_and_element {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter array length : " );
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		int i;
		int element=1;
		int flag=0;

		for(i=0;i<n;i++)
				{
					System.out.print("Enter value for "+(i)+" index position : ");
					arr[i] = sc.nextInt();
				}
				System.out.println();
				
				System.out.print("Enter element you want : ");
				element= sc.nextInt();
				for(i=0;i<n;i++)
				{
					if(arr[i]==element)
					{
						flag=1;
						break;
					}
				}
				System.out.println();
				
				if(flag==1)
				{
					System.out.println(element+" Element is find at "+(i)+" index position");
				}
				else
				{
					System.out.println(element+"element is not find any index position ");
				}
	}

}
