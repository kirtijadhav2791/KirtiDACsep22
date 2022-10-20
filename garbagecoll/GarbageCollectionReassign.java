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
			First f1 =new First(" f1 obj1");
		}
}

class GarbageCollectionReassign
{
		public static void main(String args[])
		{
			Demo d=new Demo();
			d.myFun();
			 First f2= new First(" f2 obj2");
			 f2=null;
			 
			 First f3= new First(" f3 obj3");
			 First f4= new First(" f4 obj4");
			 
			 f3=f4;
			System.gc();
			//Runtime.getRuntime().gc();
			
		}
}		