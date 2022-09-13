class Pattern7
{
public static void main(String args[]){
	
	for(int i=1;i<=5;i++)//rows
	{
		for(int j=0;j<(5-i);j++)//space
		{
			System.out.print(" ");
			//j=j-1;
			
		}
		for(int j=1;j<=(i*2-1);j++)//star
		{
			System.out.print("*");
		
		}
		System.out.println();
	}

  //for(int i=5;i>=1;i--)//rows
  for(int i=4;i>=1;i--)//rows
	{
		for(int j=1;j<=(5-i);j++)//space
		{
			System.out.print(" ");
			//j=j-1;
			
		}
		for(int j=0;j<=2*(i-1);j++)//star
		{
			System.out.print("*");
		
		}
		System.out.println();
	}
	//System.out.println();
}
}
