/*24. Write a Java program to check whether a map contains key-value mappings (empty) or 
not*/

import java.util.*;
class HashMapkeyContains
{
	 public static void main(String[] args)
	 {
	 
		HashMap<Integer,String> hashMap= new HashMap<Integer,String>();  
		
		hashMap.put(1,"Red");
		hashMap.put(2,"Blue");
		hashMap.put(3,"Pink");
		hashMap.put(4,"Brown");
		hashMap.put(5,"Orange");
		hashMap.put(6,"Black");
		hashMap.put(7,"White");
		hashMap.put(8,"Yellow");	
		
		System.out.println("\nHashMap element:");
		System.out.println(hashMap);
		 boolean result = hashMap.isEmpty();
		System.out.println("Is hash map empty: " + result);
 
		hashMap.clear();
		System.out.println("\nHashMap element:");
		System.out.println(hashMap);
         boolean result1 = hashMap.isEmpty();
		 System.out.println("Is hash map empty: " + result1);
	 }
}
