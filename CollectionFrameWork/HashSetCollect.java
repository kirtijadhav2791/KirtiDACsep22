import java.util.*;
class HashSetCollect
{
	static  void display(Set<String> set)
	{
		for(String s:set)
		{
			System.out.println(s);
		}
	}		
    
	public static void main(String args[])
	{
		
		
		HashSet<String>set1=new HashSet<String>();
		
		System.out.println("\n....add method....");
		set1.add("Harshwardhan");
		set1.add("Aditya");
		set1.add("Kirti");
		set1.add("Kamesh");
		set1.add("Mohit");
		System.out.println("set 1 element: ");
		display(set1);
		/*for(String s:set1)
		{
			System.out.println(s);
		}*/
		
		
		
		HashSet<String>set2=new HashSet<String>();
		set2.add("Kirti");
		set2.add("Kamlesh");
		set2.add("Kaustubh");
		set2.add("Ketan");
		
		HashSet<String>set3=new HashSet<String>();
		set3.add("Kirti");
		set3.add("Aditya");
		set3.add("Lokesh");
		set3.add("Manish");
		set3.add("Manthan");
		
        

		System.out.println("\nset 2 element: ");
		display(set2);
		/*for(String s:set2)
		{
			
			System.out.println(s);
		}*/
		
		System.out.println("\n....addAll method....");
		set1.addAll(set2);
		for(String s:set1)
		{
			
			System.out.println(s);
		}
		
		System.out.println("\n....clear method....");
		for(String s:set1)
		{
			
			System.out.println(s);
		}
		
		boolean b;
		System.out.println("\n....contains method....");
		//set1.contains("Kirti");
		
	
		b=set1.contains("Kirti");
		System.out.println("\n set1 contain: "+b);
		
		/*System.out.println("\n....containsAll method....");
		b=set1.containsAll("Harshwardhan");
		System.out.println("Contains all is :"+b);*/
		
		System.out.println("\n....isEmpty method....");
		b=set1.isEmpty();
		System.out.println("set is :"+b);
		
		System.out.println("\n....Reamove method....");
		set1.remove("Kirti");
		System.out.println("\nset 1 element After remove: ");
		display(set1);
		
			
		/*System.out.println("\n....ReamoveAll method....");
		set1.removeAll(set1);
		System.out.println("set1 elements after reoving all set1: ");
		display(set1);
		
		System.out.println("\n....ReamoveAll method lidt1 set2....");
		set1.removeAll(set2);
		System.out.println("set1 elements after reoving all set1: ");
		display(set2);*/
		
		System.out.println("\nset 1 element: ");
		display(set1);
		
		System.out.println("\nset 2 element: ");
		display(set2);
		
		
		System.out.println("\n....RetainAll method....");
		System.out.println("\nset 3 element: ");
		display(set3);
		set1.retainAll(set3);
		System.out.println("set1 elements after Reianing all set3: ");
		display(set1);
		
		System.out.println("\n....Size method....");
		int k=set1.size();
		System.out.println("set1 size is : "+k);
		
		System.out.println("\n....toArray method....");
		Object [] arr=set1.toArray();
		System.out.println("Itreting array set after set1.toArray() :");
		for(Object ob:arr)
		{
			System.out.println(ob); 			//ToStringValue return
		}	
	}
}	