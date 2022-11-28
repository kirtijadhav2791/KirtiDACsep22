class Pattern1
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=4-i;j++)
		 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
				{ 
					if(k==1 || k==i*2-1)
						System.out.print("*");
					
					else
						System.out.print(" ");
				}
				System.out.println();
			}
			for(int i=1;i<=9;i++)
			{
				System.out.print("*");
			}	
	}
}	