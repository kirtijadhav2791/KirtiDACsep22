//16. Write a Java program to empty an hash set.

import java.util.*;
class HashListEmpty
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
		
		hset.removeAll(hset);
		System.out.println("\n...Hash set after removing all element.. ");
		Iterator<String> it1 =hset.iterator();
		while(it.hasNext())
		{
			String s=it1.next();
			System.out.println(s);
		}
	}
}