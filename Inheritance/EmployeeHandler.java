lass ContactDetails
{
	String email;
	String mobNo;
}

class Employee
{
	int empId;
	String name;
	double salry;
	ContactDetails contDetails;
}

class EmployeeHandler
{
	public static void main(String args[])
	{
		Employee emp1 = new Employee(1,"Rajesh Patil",50000.00,"rajeshp@gmail.com","9876543232");
		Employee emp2 = new Employee(2,"Mohit Sinha",45000.00,"mohits@gmail.com","9878987676");
		
		emp1.printDetails();
		emp2.printDetails();
	}
}