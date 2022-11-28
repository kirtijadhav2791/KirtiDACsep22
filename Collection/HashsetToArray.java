//17. Write a Java program to convert a hash set to an array.

import java.util.*;
class HashsetToArray
{
	public static void main(String args[])
	{
		
		 HashSet<String>hset=new HashSet<String>();
		 
		hset.add("Red");
		hset.add("Blue");
		hset.add("Pink");
		hset.add("Brown");
		hset.add("Orange");
		hset.add("Black");
		hset.add("White");
		hset.add("Yellow");	
		
		int n=hset.size();
		int i=0;
		String str[]=new String[n];
		for(String s:hset)
	    {
			str[i++]=s;
	     
         } 
		 System.out.println(" ");
		System.out.println("After converting in array:");
			for (String n1 : str)
            System.out.print(n1+"  ");
		 System.out.println(" ");
	}
}