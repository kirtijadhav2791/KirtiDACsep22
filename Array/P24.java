/******************************************************************************
Write a program to find second largest element in a given Array in java

*******************************************************************************/
import java.util.*;
public class P24
{
	public static void main(String args[])
	{
	     Scanner sc = new Scanner(System.in);
		int s[] ={1,2,3,45,6,15};
		for(int n1 : s)
	     System.out.print(n1+" ");
	     
		int n = s.length;
	      Arrays.sort(s);
		System.out.println("second largest no is: "+ s[n-2]);
		
		for(int n1 : s)
	     System.out.print(n1+" ");
	     
	     
	     
	     
	}

}
     