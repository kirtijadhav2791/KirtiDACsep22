import java.util.*;
	class DaysToYr
	{
		public static void main(String args[])
		{    
		  int days,remDays,month,year,rem;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Days:");
		  days=sc.nextInt(); //670
		  
		  year=days/365;  //1 
		  System.out.println("Year:"+year);
		  
		  month=(days-year*365)/30; //305/30=10
		  System.out.println("Month:"+month);
		  
		  remDays=(days-year*365)-(month*30); //5
		  System.out.println("Dyas:"+remDays);
		}
	}
		  
		  
		  
		  