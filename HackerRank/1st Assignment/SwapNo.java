import java.util.*;
	class SwapNo
	{
		public static void main(String args[])
		{    
		  int num1,num2;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter 1st number:");
		  num1=sc.nextInt();
		  System.out.println("Enter 2nd number:");
		  num2=sc.nextInt();
		  
		  num1=num1+num2;
		  num2=num1-num2;
		  num1=num1-num2;
		  
		  System.out.println("After swaping 1st number is:"+num1);
		   System.out.println("After swaping 2nd number is:"+num2);
		}
	}