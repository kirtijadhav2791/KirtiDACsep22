import java.util.*;
class ReverseStringRecur
{
	static String temp;
	static String reverse(String str)
	{
		if(str.length()==0)
		{
				//System.out.println("String is Empty");
				return str;
		}
			   temp=reverse(str.substring(1))+str.charAt(0);
					//reverse(temp);
					return temp;
	}		
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nEnter String:");
		String s=sc.next();
		temp=reverse(s);
		System.out.println(temp);
	}
}	
		