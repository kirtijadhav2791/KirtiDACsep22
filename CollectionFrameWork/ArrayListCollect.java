import java.util.*;
class ArrayListCollect
{
	static  void display(List<String> list)
	{
		for(String s:list)
		{
			System.out.println(s);
		}
	}		
    
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		
		
		ArrayList <String>list1=new ArrayList<String>();
		
		System.out.println("\n....add method....");
		list1.add("Harshwardhan");
		list1.add("Aditya");
		list1.add("Kirti");
		list1.add("Kamesh");
		list1.add("Mohit");
		System.out.println("List 1 element: ");
		display(list1);
		/*for(String s:list1)
		{
			System.out.println(s);
		}*/
		
		
		
		ArrayList <String>list2=new ArrayList<String>();
		list2.add("Kirti");
		list2.add("Kamlesh");
		list2.add("Kaustubh");
		list2.add("Ketan");
		
		ArrayList <String>list3=new ArrayList<String>();
		list3.add("Kirti");
		list3.add("Aditya");
		list3.add("Lokesh");
		list3.add("Manish");
		list3.add("Manthan");
		
        

		System.out.println("\nList 2 element: ");
		display(list2);
		/*for(String s:list2)
		{
			
			System.out.println(s);
		}*/
		
		System.out.println("\n....addAll method....");
		list1.addAll(list2);
		for(String s:list1)
		{
			
			System.out.println(s);
		}
		
		System.out.println("\n....clear method....");
		for(String s:list1)
		{
			
			System.out.println(s);
		}
		
		boolean b;
		System.out.println("\n....contains method....");
		//list1.contains("Kirti");
		
	
		b=list1.contains("Kirti");
		System.out.println("\n list1 contain: "+b);
		
		/*System.out.println("\n....containsAll method....");
		b=list1.containsAll("Harshwardhan");
		System.out.println("Contains all is :"+b);*/
		
		System.out.println("\n....isEmpty method....");
		b=list1.isEmpty();
		System.out.println("list is :"+b);
		
		System.out.println("\n....Reamove method....");
		list1.remove("Kirti");
		System.out.println("\nList 1 element After remove: ");
		display(list1);
		
			
		/*System.out.println("\n....ReamoveAll method....");
		list1.removeAll(list1);
		System.out.println("List1 elements after reoving all list1: ");
		display(list1);
		
		System.out.println("\n....ReamoveAll method lidt1 list2....");
		list1.removeAll(list2);
		System.out.println("List1 elements after reoving all list1: ");
		display(list2);*/
		
		System.out.println("\nList 1 element: ");
		display(list1);
		
		System.out.println("\nList 2 element: ");
		display(list2);
		
		
		System.out.println("\n....RetainAll method....");
		System.out.println("\nList 3 element: ");
		display(list3);
		list1.retainAll(list3);
		System.out.println("List1 elements after Reianing all list3: ");
		display(list1);
		
		System.out.println("\n....Size method....");
		int k=list1.size();
		System.out.println("list1 size is : "+k);
		
		System.out.println("\n....toArray method....");
		Object [] arr=list1.toArray();
		System.out.println("Itreting array list after list1.toArray() :");
		for(Object ob:arr)
		{
			System.out.println(ob); 			//ToStringValue return
		}	
	}
}	