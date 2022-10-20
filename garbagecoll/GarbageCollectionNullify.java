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

class GarbageCollectionNullify
{
		public static void main(String args[])
		{
			Demo d=new Demo();
			d.myFun();
			 First f2= new First(" f2 obj2");
			 f2=null;//nullify
			System.gc();
			//Runtime.getRuntime().gc();
			
		}
}		