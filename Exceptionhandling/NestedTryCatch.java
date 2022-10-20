class NestedTryCatch
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
						 try
						 {
						 System.out.println(arr[3]);
						 }
						 catch(ArithmeticException e)           
						{	
						   System.out.println("ArithmeticException caught here");
						   System.out.println("which exception occure: "+e.getMessage());
						 }
						 finally
						{
							System.out.println(" first Finally block");
						}	
			     }
					 
    		    
				catch(ArithmeticException e)             //so first write chlid class handler
				{	
				   System.out.println("ArithmeticException caught here");
				   System.out.println("which exception occure: "+e.getMessage());
				}
				 catch(Exception e)
				 {
				   System.out.println("Exception caught here");
				   System.out.println("which exception occure: "+e.getMessage());
				}
				
					finally
					{
						System.out.println(" second Finally block");
					}	
		}
}		
					