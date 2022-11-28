//16. Java Program to Illustrate Use of Final Keyword
import java.util.*;
class Addition
{
	final int a=10;
	final int b=20;
	void add()
	{
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}
}	
final class Result extends Addition
{
	void makeAddition()
	{
		int result =a+b;
		System.out.println("Addition result is : "+result);
	}
}
class FinalKeyword
{
	public static void main(String args[])
	{
		Result rs=new Result();
		rs.add();
		rs.makeAddition();
	}
}
  