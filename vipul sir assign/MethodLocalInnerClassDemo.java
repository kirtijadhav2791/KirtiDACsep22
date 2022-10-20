class MethodLocalInnerClassDemo
{
	public Static void myfun()
	{
	  System.out.println("MyFun of MethodLocalInnerClassDemo");
	  {
		
		//method inner class
		//Its object will always be created inside this method only
		 class MyClass
		 {
			int add(int a,int b)
			{
				return a+b;
			}
				
		}
			MyClass myObj1 =new MyClass
		