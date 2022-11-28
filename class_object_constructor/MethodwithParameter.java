//14. Java Program to Create a Method with 2 Parameters and without Return Type
import java.util.*;
class MethodwithParameter
{
	void addition(int a,int b)
	{
		
		int result=a+b;
		System.out.println("Result of addition is :"+result);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for a:");
		int a=sc.nextInt();
		System.out.println("Enter value for b:");
		int b=sc.nextInt();
	
		MethodwithParameter mp=new MethodwithParameter();
		mp.addition(a,b);
	}
}
  