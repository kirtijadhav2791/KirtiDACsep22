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
  
  public boolean equals(Demo d)      //(Object obj)  if(this a==(Demo)obj.a && this.b==(Demo)obj.b)
  {
     if(this.a==d.a && this.b== d.b)
	 {
			return true;
	 }
		else
		{
			return false;
		}
  }
	public int hashCode()
	{
		return 31*(a+b);
	}  
}

class OverridingEqualsMethods
{

		public static void main(String args[])
		{
		    Demo d1 =new Demo(5,10);
			System.out.println(d1);
			
			Demo d2=new Demo(5,10);
			//Demo d2=new Demo(5,11);
			System.out.println("d1.equals(d2): "+d1.equals(d2));
			
			System.out.println("d1.hashcode: " +d1.hashCode());
			System.out.println("d2.hashcode: " +d2.hashCode());
		}
}		