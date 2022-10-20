abstract class Employee
{
	
	String name;
	int id;
	
	abstract double getSalary();  //if we not write abstract below error will come
	
	abstract void printDetails();  // missing method body, or declare abstract
	
	
}

class RegEmp extends Employee
	{
		double basicPay;
		RegEmp()  //constructoer
		{}
		RegEmp(String name, int id, double basicPay)
		{
			this.name=name;
			this.id=id;
			this.basicPay=basicPay;
		}
		double getSalary()
		{
			return 1.7*basicPay;
		}
		void printDetails()
		{
			System.out.println("id="+id+" name "+name+" total salary "+getSalary() );
		}
	}

abstract class Contract extends Employee
	{
		int noOfYears;
	}


class CdacContrctBase extends Contract
	{	
		double basicPay;
		
		CdacContrctBase(){}
		
		CdacContrctBase(String name, int id, double basicPay, int noOfYears)
		{
			this.name=name;
			this.id=id;
			this.basicPay=basicPay;
			this.noOfYears=noOfYears;
		}
		
		double getSalary()
		{
			return 1000+basicPay;
		}
	
		void printDetails()
		{
			System.out.println("id="+ id +" name "+ name +" total salary "+ getSalary() +" no of years of service"+ noOfYears);
		}
		
	
	}
class ThirdParty extends Contract
	{
		double basicPay;

		ThirdParty(){}
		
		ThirdParty(String name, double basicPay, int noOfYears)
		{
		this.name=name;
		this.basicPay=basicPay;
		this.noOfYears=noOfYears;
		}
		
		double getSalary()
		{
			return 1000+basicPay;
		}
	
		void printDetails()
		{
			System.out.println( " name "+name+" total salary "+getSalary()+" no of years of service"+noOfYears);
		}
	
	
	}







class CDACEmployee
	{
		public static void main(String args[])
		{
			RegEmp a = new RegEmp("kamesh",111,50000);
			CdacContrctBase b = new CdacContrctBase("vedant",222,100000,5);
			ThirdParty c =new ThirdParty("Yash",30000,5);
			
			a.printDetails();
			b.printDetails();
			c.printDetails();
			
			
			
		}
	
	
	}