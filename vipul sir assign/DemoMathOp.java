import java.util.*;
import java.lang.*;
class MathOperation
{
	static void add(int a, int b)
	{
	  int sum;
	  sum=a+b;
	  System.out.println("\nSum of two numbers are:"+sum);
	}
	
	static void substract(int a, int b)
	{
	  int sub;
	  sub=a-b;
	  System.out.println("\nsubstraction of two numbers are:"+sub);
	}
	
	static void multiplay(int a, int b)
	{
	  int mul;
	  mul=a*b;
	  System.out.println("\nmultiplication of two numbers are:"+mul);
	}
	
	
	static void power(int a, int b)
	{
	  int res;
	 // res=(Math.pow(a,b));
	  System.out.println("\n power of two numbers are:"+(Math.pow(a,b)));
	}
}
class DemoMathOp
{
	public static void main(String args[])
	{
		int num1,num2;
		DemoMathOp dm=new DemoMathOp();
		MathOperation mo=new MathOperation();
		mo.add(4,5);
		
		mo.substract(40,20);
		
		mo.multiplay(10,20);
		
		mo.power(8,2);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("\nEnter two numbers:");
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		mo.add(num1,num2);
		
		mo.substract(num1,num2);
		
		mo.multiplay(num1,num2);
		
		mo.power(num1,num2);
	}
}	