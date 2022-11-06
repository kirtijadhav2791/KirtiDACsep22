class SelectionSort
{
	 static void sSort(int a1[])
	{
		int n=a1.length;
		int i,j;
		for( i=0;i<n-1;i++)
		{
			int min=i;
			for(j=i+1;j<n;j++)
			{
				if(a1[min]>a1[j])
				{
					min=j;
				}
			}		
					//swapping
					int temp=a1[min];
					a1[min]=a1[i];
					a1[i]=temp;
				System.out.print("\n"+i+" itration ");
				display(a1);
				System.out.println();
				System.out.println("\n....."+(i+1)+"  Pass Completed....");
			}
			//System.out.println("\n....."+(i+1)+"  Pass Completed....");
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
		sSort(a1);
		System.out.println("\nAfter applying Selection sorting:");
		display(a1);
	}
}	