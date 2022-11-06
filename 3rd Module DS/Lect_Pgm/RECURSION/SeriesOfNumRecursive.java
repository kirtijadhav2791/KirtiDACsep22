import java.util.*;
class SeriesOfNumRecursive
{
	static int series(int num)
	{
		
	
		System.out.println(num);
		if(num<=1)
		return 1;
		else
			return series(num-1);
	}
	
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
	    
		System.out.println("Enter number for series:");
		 num=sc.nextInt();
		 System.out.println();
		  series(num);
			 //System.out.println("Series of number : "+series(num));
	}	
}
	