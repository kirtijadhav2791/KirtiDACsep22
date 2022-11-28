/******************************************************************************
How to find the missing number in a given Array from number 1 to 100 ?

*******************************************************************************/
import java.util.*;
public class P15
{
    
    public static void main(String args[])
    {
    
         Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number elements in array : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < a.length; i++){
			
			a[i] = sc.nextInt();
			
		}
		
		int sum = ((n + 1 ) * (n + 2)) / 2;
          for (int i = 0; i < n; i++)
          sum -= a[i];
          System.out.println(sum+"<------missing ele ");
		
	/*	
		int totSum = n*(n+1)/2;
		
		int arrSum = 0;
		for(int i = 0; i < a.length; i++){
			
			arrSum = arrSum + a[i];
		}
		System.out.println(arrSum+", ");
		int num = totSum - arrSum;
		System.out.println("Missing number in the array is : "+num);
       */  
         
    }
}
