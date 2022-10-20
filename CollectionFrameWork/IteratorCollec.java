iimport java.util.*;
class IteratorCollec
{
		public static void main(String args[])
	{
		List<String>list1=new ArrayList<String>();
		
		System.out.println("\n....add method....");
		list1.add("Harshwardhan");
		list1.add("Aditya");
		list1.add("Kirti");
		list1.add("Kamesh");
		list1.add("Mohit");
		
		System.out.println("Using For -each loop list1 element: ");
		for(String s:list1)
		{
			System.out.println(s);
			
		}
		
		System.out.println("\n...Using Itreator list1 element.. ");
		Iterator<String> it =list1.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}
		System.out.println("\n...Using ListItreator list1 element.... ");
		ListIterator<String> lit =list1.listIterator();
		while(lit.hasNext())
		{
			String s=lit.next();
			System.out.println(s);
	    }
		 
		System.out.println("\n...Using Enumaration list1 element.... ");
		Enumeration<String> em =Collections.enumeration(list1);
		while(em.hasMoreElements())
		{
			String s=em.nextElement();
			System.out.println(s);
	     }
		 
		/* System.out.println("\n....Reamove method....");
		em.remove("Kirti");
		System.out.println("\nList 1 element After remove: ");
		display(list1);*/ 
		//we can't perform remove opration on enumration
		
		 
     }
}