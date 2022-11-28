//15. Write a Java program to iterate through all elements in a hash hset

import java.util.*;
class HashListIterate
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
		
		System.out.println("\n...Using Itreator hset1 element.. ");
		Iterator<String> it =hset.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}
	}
}	