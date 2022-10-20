class Demo
{
  int a;
  int b;
  
  Demo()
  {
   
  }
  Demo(int a,int b)
  {
    this.a=a;
	this.b=b;
  }
  void fun()
  {
  System.out.println("fun1 of Demo");
  }
  public String toString()
  {
  String str="Demo[a= " +a+ ", b= "+b+ "]";
  return str;
  }
}

class OverridingToStringMethods
{

		public static void main(String args[])
		{
		    Demo d1 =new Demo(5,10);
			System.out.println(d1);
		}
}		