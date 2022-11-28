/******************************************************************************
How to convert Array to TreeSet in java ?

*******************************************************************************/
import java.util.*;
public class P22
{
	public static void main(String args[])
	{
		int s[] ={10,185,3,5,6,9,8,7,7};
		
		
		Set <Integer> a = new TreeSet<>();
		
		for(int i : s)
	     a.add(i);
	     
	     System.out.println(a);
	     //duplicates removed and sorted array come
	     
	     
	}

}
     