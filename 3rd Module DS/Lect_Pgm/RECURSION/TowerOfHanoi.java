class TowerOfHanoi
{
	static void toh(int n, String source,String  temp,String  destination)
	{
		if(n==1)
			System.out.println("\n"+source+" to "+destination);
		else
		{
			toh(n-1,source,destination,temp);
			System.out.println("\n"+source+" to "+destination);
			toh(n-1,temp,source,destination);
			System.out.println("\n"+temp+" to "+destination);
		}
	}	
	
	public static void main(String args[])
	{
		int n=3;
		toh(n,"source","temp","destination");
	}
}	