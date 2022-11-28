/******************************************************************************
How do you separate zeros and non-zeros in a given Array in java?

*******************************************************************************/
import java.util.*;
public class P20
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int arr[]={1,0,2,0,0,3,1000};

		int n = arr.length;
		n--;
		int i,count=0;
		for(i=0;i<arr.length;i++)
		{
		     if(arr[i]!=0){
		          
		          arr[count] = arr[i];
		          count++;
		          System.out.print(arr[i]+", ");
		          
		     }
		   
		
		}
	
	}

}
     