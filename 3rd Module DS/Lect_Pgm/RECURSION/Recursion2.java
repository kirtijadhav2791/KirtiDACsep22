class Recursion2
{
	///static int i=0;
	static int show(int n)
	{
	
	
		if(n==5) //termination cond or base cond
		return n;
		else
		return 2*show(n+1);
		//System.out.println("Happy Diwali !!!!");
	}
	public static void main(String args[])
	{
		
	    System.out.println(show(3));
	}
}	
   	