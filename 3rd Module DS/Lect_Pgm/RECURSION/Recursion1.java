class Recursion1
{
	static int i=0;
	static void show()
	{
		
		i++;
		if(i<=5) //termination cond or base cond
		{
		System.out.println("Happy Diwali !!!!");
		show();
		}
	}
	public static void main(String args[])
	{
	    show();
	}
}	
   	