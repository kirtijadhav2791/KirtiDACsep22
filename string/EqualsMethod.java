class Demo
{
  int a;
  
  Demo()
  {
   
  }
  Demo(int a)
  {
    this.a=a;
  }
  void fun()
  {
  System.out.println("fun1 of Demo");
  }
}

class EqualsMethod
{

		public static void main(String args[])
		{
		    Demo d1 =new Demo(5);
			Demo d2 =new Demo(5);
			Demo d3;
			d3=d1;
			System.out.println(d1.hashCode());
			System.out.println(d2.hashCode());
			
			System.out.println("d1.tostring(): "+d1.toString());
			System.out.println("d2.tostring(): "+d2.toString());
			
			System.out.println("d1.equals(d2): "+d1.equals(d2));
			System.out.println("d1.equals(d3): "+d1.equals(d3));
		
		}
}		