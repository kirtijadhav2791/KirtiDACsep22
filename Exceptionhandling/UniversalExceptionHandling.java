class UniversalExceptionHandling
{
		public static void main(String args[])
		{
				int a=10;
				int b=0;
				int res=0;
				int arr[]={5,10,15,12,20};
				try
				{
					 res=a/b;
					 //System.out.println(arr[3]);
					 
				}
				catch(Exception e)//error:= 
				{	                    /*exception ArithmeticException has already been caught catch(ArithmeticException e)*/
				   System.out.println("Exception caught here");
				   System.out.println("which exception occure: "+e.getMessage());
				}
				catch(ArithmeticException e)             //so first write chlid class handler
				{	
				   System.out.println("ArithmeticException caught here");
				   System.out.println("which exception occure: "+e.getMessage());
				}
				
					finally
					{
						System.out.println("Finally block");
					}	
					
				 //System.out.println(arr[5]);
					System.out.println("result "+res);
					System.out.println("Program exected succesfully");
				
		}
}