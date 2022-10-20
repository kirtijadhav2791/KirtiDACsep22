abstract class Employee 
{ 
	int empId;
	String empName;
	
	Employee(String empId,String empName)
	{
		this.emplId = empId;
		this.emplName = empName;.
	}
	abstract void getSalary();
	abstract void printDetails();
}

class RegularEmployee extends Employee
{  
	double ToatlSal;
	int basicSal;
	RegularEmployee()
	{
	}	
	RegularEmployee(int id,String name,double ToatlSal)
	{
		this.EmpId=id;
		this.name=name;
		this.Totalsal=Totalsal;
	}
	public void getSalary()
	{
		TotalSal=basicsal*1.7;
		return TotalSal;
	}
	public void printDetails()
	{
		System.out.println("Employee Id: "+EmpId+ "Employee name: "+empName+ "Employee salary :"+Totalsal);
		
	}	
	
}	
	
