/******************************************************************************
How to convert ArrayList to String Array in java

*******************************************************************************/
import java.util.*;
public class P23
{
	public static void main(String args[])
	{
	     Scanner sc = new Scanner(System.in);
		//String s[] ={"kamesh", "mahajan", "kaustubh", "mohit"};
		
		
		List <String> a = new ArrayList<>();
	     a.add("kamesh");
	     a.add("nomdas");
	     a.add("mahajan");
	     
	     System.out.println(a);
	     System.out.println();
	     for(String s : a)
	     System.out.println(s);
	     
	     
	     //-----toArray method---------
	    // Object s[] = a.toArray();
	     
	     String s[]=a.toArray(new String[a.size()]);
	     
	     for(Object n : s)
	     System.out.print(n+" ");
	     
	     
	     
	     
	}

}
     