/*
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F
*/
class Pattern11
{
	public static void main(String args[])
	{
		//int a=65;
		for(int i=1;i<=6;i++)
		{
			int a=65;
			for(int j=6;j>=i;j--)
			{
					System.out.print((char)a+" ");
					a++;
			}
			
			System.out.println();
		}
		for(int i=1;i<=6;i++)
		{
			int a=65;
			for(int j=1;j<=i;j++)
			{
					System.out.print((char)a+" ");
					a++;
			}
			System.out.println();
		}
	}
}	