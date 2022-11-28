//6. Java Program to Create Outer Class Bank Account and the Inner Class Interest in it

import java.util.*;

class BankAccount
{
	Scanner sc=new Scanner(System.in);
	String name;
	long accountNo;
	double AccoBalance;
	int IR=7;
	void printAccountDetails()
	{
		
		System.out.println("Enter your name:");
		name=sc.next();
		System.out.println("Enter your account number:");
		accountNo=sc.nextLong();
		System.out.println("Enter your account balnce:");
		AccoBalance=sc.nextDouble();
	}
	
	class Interest
	{
		
	void calInterest()
		{
			printAccountDetails();
			double totalIR= ( AccoBalance *IR )/ 100;
			
			double finalAmount=totalIR+AccoBalance;
			System.out.println("Total balance with interest rate :"+finalAmount);
			
		}
	}
	
}

class BankAccountMain
{
	
	public static void main(String args[])
	{
		
		BankAccount ba=new BankAccount();  
		
		BankAccount.Interest ir = ba.new Interest();
		 ir.calInterest();
		
	}
}
