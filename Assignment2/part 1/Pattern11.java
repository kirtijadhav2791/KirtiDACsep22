class Pattern11
{
public static void main(String args[]){
	
	for(int i=1;i<=8;i++)//rows
	{
		for(int j=4;j>=i;j--)//space
		{
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++)//star
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	
} 
}
