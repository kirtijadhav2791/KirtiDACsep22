class SumOfNaturalNoRecursive
{ 
	static int temp;
	static int natural(int num)
	{
		if(num<=1)
			return num;
	
		else	
		return (num)+natural(num-1);
   }
	public static void main(String args[])
	{
		int num=50;
	
		System.out.println("\n sum of 50 natural number is: "+natural(num));
	}
}	
			