class First
{
	int a=5;
	//System.out.println("value of a="+f.a);
	//System.out.println(a);
}
class Second extends First
{
	 int b=10;
	 //System.out.println("value of b="+f.b);
}
class Third extends Second
{
	int c=15;
	//System.out.println("value of c="+f.c);
}
class Fourth extends Third
{
		int d=20;
		//System.out.println("value of d="+f.d);
}

class MultilevelInheritance
{
		public static void main(String args[])
		{
			Fourth f= new Fourth();
			System.out.println(f.a);
			System.out.println("value of a="+f.a);
			System.out.println("value of b="+f.b);
			System.out.println("value of c="+f.c);
			System.out.println("value of d="+f.d);
		}
}		
		