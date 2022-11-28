//22.Write a Java program to count the number of key-value (size) mappings in a map

import java.util.*;
class HashMapkey
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
		
		int n=hashMap.size();
		System.out.println("\nsize of HashMap is : "+n);
	 }
}