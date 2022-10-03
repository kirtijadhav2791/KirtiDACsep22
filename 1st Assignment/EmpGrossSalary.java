import java.util.*;
	class EmpGrossSalary
	{
		public static void main(String args[])
		{    
		  double hra,da,gs;
		  int salary;
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter your salary:");
		  salary=sc.nextInt();
		  
		  if(salary<10000)
		  {
			  hra=(salary *10)/100;
			  
			  da=(salary*90)/100;
			  
			  gs=salary+hra+da;
			  
		     System.out.println("Salary including allowances is:"+gs);
		  }
		  
		  if(salary>=10000)
		  {
			   hra=salary+2000;
			  
			  da=(salary*98)/100;
			  
			  gs=salary+hra+da;
			  
		      System.out.println("Salary including allowances is:"+gs);
		  }
   	  }
	}	  