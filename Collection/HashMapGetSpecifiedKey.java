//25. Write a Java program to get the value of a specified key in a map

import java.util.*;
class HashMapGetSpecifiedKey
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
		
		 String str=(String)hashMap.get(3); 
  
		System.out.println("\nValue for key 3 is: " + str);
	
	 }
}
