class ThrowsException
{
	public static void myFun() throws ArithmeticException
	{
		//code
	}	
	
		public static void main(String args[])
		{
			
				System.out.println("pgm started");
				try
				{
					myFun();
				}
				catch(ArithmeticException e)
				{	
				   System.out.println("ArithmeticException caught here");
				   System.out.println("which exception occure: "+e.getMessage());
				}
				finally
					{
						System.out.println("Finally block");
					}	
					
					
					System.out.println("Program exected succesfully");
				
		}
}