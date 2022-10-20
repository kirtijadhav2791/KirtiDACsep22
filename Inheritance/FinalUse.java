final class First
{
		final int num;
		
		First()
		{
			num=1;
			//num=5;
		}
			
		final void myFun()
		{
			System.out.println("myFun of First");
		}
}

class second //extends First
{
			/*void myFun()
		{
			System.out.println("myFun of second");
		}*/
}

class FinalUse
{
		public static void main(String args[])
		{
			final int a=5;
			//int a=10;
			//System.out.println(a);
			
			First f =new First();
		}
}		