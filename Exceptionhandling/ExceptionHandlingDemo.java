class ExceptionHandlingDemo
{
		public static void main(String args[])
		{
				int a=10;
				int b=0;
					int res=0;
				try
				{
					 res=a/b;
				}
				catch(ArithmeticException e)
				{	
				   System.out.println("ArithmeticException caught here");
				   System.out.println("which exception occure: "+e.getMessage());
				}
				
					System.out.println("result "+res);
					System.out.println("Pgm exected succesfully");
				
		}
}