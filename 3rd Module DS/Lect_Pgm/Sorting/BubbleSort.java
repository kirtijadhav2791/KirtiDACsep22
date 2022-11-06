class BubbleSort
{
	 static void bSort(int a1[])
	{
		int n=a1.length;
		int j;
		for(int i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a1[j]>a1[j+1])
				{
					//swapping
					int temp=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
				}
				System.out.print("\n"+i+" itration ");
				display(a1);
				System.out.println();
			}
			System.out.println("\n....."+(i+1)+"  Pass Completed....");
		}
		
	}
		
		static void display(int a1[])
		{
			int n=a1.length;
			for(int i=0;i<n;i++)
			{
				System.out.print(a1[i]+"  ");
			}
		}		
		
			
		
	public static void main(String args[])
	{
		int a1[]={5,7,1,9,4,8,3};
		
		System.out.println("\nBefore sorting:\n");
		display(a1);
		bSort(a1);
		System.out.println("\nAfter applying bubble sorting:");
		display(a1);
	}
}	