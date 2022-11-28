/*18. Write a Java program to compare two sets and retain elements which are same on both 
sets.*/

import java.util.*;
class CompareTwoHashsetRetain
{
	static void display(HashSet<String> hset)
	{
	  for(String s:hset)
	  {
	     System.out.println(s);
      } 
	} 
	public static void main(String args[])
	{
		
		 HashSet<String>hset1=new HashSet<String>();
		 
		hset1.add("Red");
		hset1.add("Blue");
		hset1.add("Pink");
		hset1.add("Brown");
		hset1.add("Orange");
		hset1.add("Black");
		hset1.add("White");
		hset1.add("Yellow");
			
		System.out.println("\n...Elements in First Hash set.. ");
			display(hset1);
		
		HashSet<String>hset2=new HashSet<String>();
		hset2.add("Golden");
		hset2.add("silver");
		hset2.add("Blue");
		hset2.add("Chocolate");
		hset2.add("white");
		
		System.out.println("\n...Elements in Second Hash set.. ");
			display(hset2);
		
		hset1.retainAll(hset2);
		System.out.println("\n... Hash set after retain .. ");
		display(hset1);
	}
}