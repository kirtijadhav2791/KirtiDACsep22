class First
{
	int num=3;
	
	void myFun(int x,int y)
	{
			System.out.println("myFun of the first");
			
			System.out.println(+x+" "+y);
	}

	void anotherFun(int a)
	{
			System.out.println("AnotherFun of First");
	}
}

class Second extends First
{
	void myFun(int x,int y)
    {
		super.myFun(x,y);
		System.out.println("myFun of Second");
		System.out.println(super.num);
	}
}

public class OverridingUsingSuper
{
		public static void main(String args[])
		{
		 First f =new First();
		
		   Second s= new Second();
		   s.myFun(2,5);
		   // f.anotherFun();
		   s.anotherFun(5);
		 }
}		 