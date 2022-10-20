class Demo
{
  int a;
  void fun()
  {
  System.out.println("fun1 of Demo");
  }
}

class ToStringMethod
{

		public static void main(String args[])
		{
		    Demo d1 =new Demo();
			Demo d2 =new Demo();
			System.out.println(d1.hashCode());
			System.out.println(d2.hashCode());
			
			System.out.println("d1.tostring(): "+d1.toString());
			System.out.println("d2.tostring(): "+d2.toString());
		
		}
}		