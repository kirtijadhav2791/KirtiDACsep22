class First
{
	String name;
	First()
	{
	}	
	
	First(String name)
	{
		this.name=name;
	}
	public void finalize()
	{
		System.out.println("Finalize called for object="+name);
	}
}

class Demo
{
		void myFun()
		{
			First f1 =new First("first obj");
		}
}

class GarbageCollection
{
		public static void main(String args[])
		{
			Demo d=new Demo();
			d.myFun();
			System.gc();
			//Runtime.getRuntime().gc();
			
		}
}		