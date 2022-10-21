import java.util.*;
	class ConvertTemp
	{
		public static void main(String args[])
		{    
		  double tempFahr,tempCel;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter tempeture in Fahrenheit:");
		  tempFahr=sc.nextDouble();
		  
		  tempCel=5*(tempFahr-32)/9;
          
          System.out.println("Tempreture in Celsius:"+tempCel);
		}
    }		