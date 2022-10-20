class First
{
		 static void myFun()
		{
			System.out.println("myfun1 of first");
		}
		
		void anotherFun()
		{
		 System.out.println("anotherfun of First");
		}
}

class Second extends First
{
		 static void fun2()
		{
		 System.out.println("myfun1 of  second");
		 }
			 
		void fun3()
		{
		    System.out.println("anotherfun of sencond");
		}
}

class MethodHidingDemo
{
		public static void main(String args[])
		{
			First f;
			f=new Second();
			
			//Second s = new Second();
			
			f.myFun();
			f.anotherFun();
			
			//s.myFun();
			//s.anotherFun();
			
		}
}
		