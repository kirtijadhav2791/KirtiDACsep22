//18. Java Program to Illustrates Use of Chaining Constructor
class Addition
{
	Addition()
	{
		System.out.println("Default constructor");
	}
	Addition(int a)
	{
		System.out.println("\nValue of the a is : "+a);	
	}
	
	Addition(int a,int b)
	{
		this(a);
		System.out.println("\nAddition of the a and b is : "+(a+b));	
	}
	
	Addition(int a,int b,int c)
	{
		this(a,b);
		System.out.println("\nAddition of the a, b and c is : "+(a+b+c));
	}
	
}

class ConstructorChaining
{
	
	public static void main(String args[])
	{
		Addition a1=new Addition(10,20,30);
	}
}