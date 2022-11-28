import java.util.*;
class Collection6
{
	static void display(List<String> list)
	{
	  for(String s:list)
	  {
	     System.out.println(s);
      } 
	} 
	public static void main(String args[])
	{
		List<String>list=new ArrayList<String>();
		
		list.add("Red");
		list.add("Blue");
		list.add("Pink");
		list.add("Brown");
		list.add("Orange");
		list.add("Black");
		list.add("White");
		list.add("Yellow");	
		
		System.out.println("\nElements in ArrayList:\n");
		display(list);
		
		System.out.println("\n Swap Element from ArrayList: ");
		Collection.swap(list,0,2);
		System.out.println("\n \ ArrayList After swapping: ");
		display(list);
	}
}	