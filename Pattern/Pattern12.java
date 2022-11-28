/*
 A 
 A B 
 A B C 
 A B C D 
A B C D E 
A B C D E F
*/
class Pattern12
{
	public static void main(String args[])
	{
		for(int i=6;i>=1;i--)
		{
			int a=65;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(" ");
			}	
			
			for(int k=i;k<=6;k++)
			{
				
				 System.out.print((char)a+" ");
				 a++;
				
			}
			System.out.println();
			}				
	}
}	