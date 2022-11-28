/*22. Java Program to Check the Accessibility of Static and Non-Static Variable by a Static 
Method*/

class Arithmatic
{
	static int a;
	static int b;
	int p,q;
	
   Arithmatic()
   {
	   System.out.println("Default constructor");
   }
  Arithmatic(int a,int b,int p,int q)
  {
	  this.a=a;
	  this.b=b;
	  this.p=p;
	  this.q=q;
  }
   static void printAdd()
   {
	   System.out.println("Static method access only static variables : ");
	    System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		int res=a+b;
		System.out.println("Result of a + b : "+res);
   }
   void printMultAdd()
   {
	    System.out.println("\nNon-Static method access both static and Non-static variables : ");
		System.out.println("Value of a : "+a);
		System.out.println("Value of b : "+b);
		int res=a+b;
		System.out.println("Result of a + b : "+res);
		 System.out.println("\nValue of p : "+p);
		System.out.println("Value of q : "+q);
		int res1=p*q;
		System.out.println("Result of p * q : "+res1);
	   
   }
}
 
 class AccessibilityOfStaticNonStatic
 {
	 public static void main(String args[])
	{
		Arithmatic a=new Arithmatic(10,20,13,31);
		a.printAdd();
		a.printMultAdd();
	}
 }