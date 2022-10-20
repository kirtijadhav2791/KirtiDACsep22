class First 
{
		void myfun(int x,int y)
		{
			System.out.println("myfun of first");
		}
		void anotherFun(int x)
		{
			System.out.println("anotherFun of First");
		}
}

class Second extends First
{
		void myFun(int x,int y)
		{
		 System.out.println("myFun of second");
		 }
}

public class OverridingDemo
{
		public static void main(String args[])
		{
			Second s =new Second();
			s.myFun(2,5);
			s.anotherFun(5);
		}
}		
		