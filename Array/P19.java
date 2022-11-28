/******************************************************************************
Write a program to sum all the values of a given Array in java?

*******************************************************************************/
import java.util.*;
public class P19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,size=100,sum=1,sum1=0;
		System.out.println("enter no of array");
		int n = sc.nextInt();
		int arr[]=new int[n];
		     
		    for(int k = 0; k<arr.length; k++)
		    arr[k] = sc.nextInt();
		
		
		for(i=1;i<arr.length;i++)
		{
			sum+=arr[i];
			
		
		//	System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.print("\nsum of Array is "+ sum);
	
	
	}

}
     