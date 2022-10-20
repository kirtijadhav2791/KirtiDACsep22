class First
{
		void fun1()
		{
			System.out.println("Fun1 of first");
		}
		
		void fun2()
		{
		 System.out.println("fun2 of First");
		}
}

class Second extends First
{
		void fun2()
		{
		  System.out.println("fun2 of second");
		 }
			 
		void fun3()
		{
		   System.out.println("fun3 of sencond");
		}
}

class ParentRefDemo
{
		public static void main(String args[])
		{
			First f;
			f=new Second();
			
			f.fun1();
			f.fun2();
			
			Second s= new First();
			
		}
}			  