interface MyInterface
{
		void fun1();
		interface AnotherInterface
		{
			void fun2();
		}
}

//Not mandatory to implement inner interfac method for the //implementing class
class First implements MyInterface
{
			public void fun1()
			{
				System.out.println("fun1 of First");
			}
}

//Not mandatory to implement enclosing interface i.e MyInterface  //method for the implementing class
class Second implements MyInterface.AnotherInterface
{
		public void fun2()
			{
				System.out.println("fun2 of First");
			}
}
class InnerInterfaceDemo
{
		public static void main(String args[])
		{
			MyInterface f=new First();
			//First f=new First();
			f.fun1();
			
			MyInterface.AnotherInterface s=new Second();
			//Second s= new Second();
			s.fun2();
		}
}		