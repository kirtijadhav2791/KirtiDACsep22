/*
 
  A
 B B
 C C
 D D
 E E
 F F
 E E
 D D
 C C
 B B
  A
  */
class Pattern13
{
	public static void main(String args[])
	{
			int a=65;
		for(int i=1;i<=6;i++)
		{
			
			for(int j=1;j<=6-i;j++)
		 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{ 
				if(k==1 || k==i*2-1)
				{
					System.out.print((char)a);
				}	
					
					else
						System.out.print(" ");
			}
				a++;
				System.out.println();
			}			
			  a=69;
			for(int i=5;i>=1;i--)
		   {
			 // int a=69;
				for(int j=1;j<=6-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i*2-1;k++)
				{ 
					if(k==1 || k==i*2-1)
					{
						System.out.print((char)a);
					}	
					else
						System.out.print(" ");
				}
				a--;
				System.out.println();
			}
    	}		
}
