import java.util.*;
	class SimpleIntrest
	{
		public static void main(String args[])
		{    
		  Scanner sc=new Scanner(System.in);
		  int amt,rate,year;
			  double simpleIntrest,total;
			  System.out.println("Enter your amount:");
			  amt=sc.nextInt();
			  System.out.println("Enter Inreste Rate:");
			  rate=sc.nextInt();
			  System.out.println("Enter Year:");
			  year=sc.nextInt();
			simpleIntrest=(amt*rate*year)/100;
         System.out.println("Simple Intrest is:"+simpleIntrest);		
		 total= amt + simpleIntrest;
		 System.out.println("Amount after Simple Intrest is:"+total);	
		}
	}	