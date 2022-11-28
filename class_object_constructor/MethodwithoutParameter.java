//12. Java Program to Create a Method without Parameters and with Return Type
import java.util.*;
class MethodwithoutParameter
{
	int result;
	Scanner sc=new Scanner(System.in);
	
	void addition()
	{
		System.out.println("Enter value for a:");
		int a=sc.nextInt();
		System.out.println("Enter value for b:");
		int b=sc.nextInt();
	
		result=a+b;
		System.out.println("Result of addition is :"+result);
	}
	
	public static void main(String args[])
	{
		MethodwithoutParameter mp=new MethodwithoutParameter();
		mp.addition();
	}
}
  
