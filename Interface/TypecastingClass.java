class First
{
	void fun()
	{
		System.out.println("In fun First");
	}
}

class Second extends First
{
	void fun()
	{
		System.out.println("In fun Second");
	}
	}
   
class Third
{
	void fun()
	{
		System.out.println("In fun Third");
	}
}	
class TypecastingClass
{
		public static void main(String args[])
		{
		  First f=new First();
		  Second s=new Second();
		  Third t=new Third();
		  
		 //// f=(First)s;   //f=s;is also fine;upcasting
		  f.fun();     //Second fun()
		  
		 // s=f;  //chilf ref= parent obj ...error		      
		// s=(Second)f;
		
	//First f1=new Second();
		 ((Second)f).fun();
		 // s.fun();
	    }
}
		 