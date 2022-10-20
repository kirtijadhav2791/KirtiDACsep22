abstract class Employee 
{ 
	int empId;
	String empName;
	
	abstract  double getSalary();
	abstract void printDetails();
}

class RegularEmployee extends Employee
{  
	double totalSal;
	int basicSal;
	RegularEmployee()
	{
	}	
	RegularEmployee(int id,String name,double totalSal)
	{
		this.empId=id;
		this.empName=name;
		this.totalSal=totalSal;
	}
	public   double getSalary(double consolidatesal)
	{
		totalSal=basicsal*1.7;
		return totalSal;
	}
	public void printDetails()
	{
		System.out.println("Employee Id: "+empId+ "Employee name: "+empName+ "Employee salary :"+totalSal);
		
	}
}	
	
abstract class CdacContractBase extends Employee
{
  int noOfYears;
  abstract int getNoOfYears();
  abstract double getSalary();
  abstract void printDetails();
}

class CdacCbEmp extends CdacContractBase
{
 int basicsal;
 double consolidatesal;
  CdacCbEmp()
  {
	  
  }
  void getNoOfYears(int noOfYears)
  {
	  this.noOfYears=noOfYears;
  }
  CdacCbEmp(int empId,String empName,double consolidatesal,int noOfYears)
	{
		this.empId=empId;
		this.empName=empName;
		this.consolidatesal=consolidatesal;
		this.noOfYears=noOfYears;
	}	
	public  double getSalary(double consolidatesal)
	{
		consolidatesal=basicsal*1.7;
		return consolidatesal;
	}
  
  void printDetails()
  {
	  System.out.println("Employee Id: "+empId+ "Employee name: "+empName+ "Employee salary :"+consolidatesal+" No of service year: "+noOfYears);
  }
}
class ThirdPartyEmp extends  CdacContractBase
{
	double consolidatesal;
	int basicsal;
	ThirdPartyEmp()
	{
	}
	public  double getSalary(double consolidatesal)
	{
		consolidatesal=basicsal*1.7;
		return consolidatesal;
	}
	ThirdPartyEmp(String empName,double consolidatesal ,int noOfYears)
	{
		this.empId=empId;
		this.empName=empName;
		this.consolidatesal=consolidatesal;
		this.noOfYears=noOfYears;
	}	
     void printDetails()
  {
	  System.out.println("Employee Id: "+empId+ "Employee name: "+empName+ "Employee salary :"+consolidatesal+" No of service year: "+noOfYears);
  }
}

class CdacEmployee 
{
		public static void main(String args[])
		{
			RegularEmployee  RE=new RegularEmployee(03,"Kirti",30000);
			CdacCbEmp CE=new CdacCbEmp(05,"Aditya",50000,4);
            ThirdPartyEmp TE=new ThirdPartyEmp("Pooja",45000,3);
			
			RE.printDetails();
			CE.printDetails();
			TE.printDetails();
		}
}		
  
  
	
