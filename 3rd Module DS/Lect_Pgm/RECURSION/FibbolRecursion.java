class FibbolRecursion
{
	static int fib(int n)
	{
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
	}	
	public static void main(String args[])
	{
		//complele it
		int n=8;
	    System.out.println(fib(n));
	}	
		
}	
   	