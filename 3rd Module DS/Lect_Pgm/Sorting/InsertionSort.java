class InsertionSort
{
	 static void iSort(int a1[])
	{
		int n=a1.length;
		int j,i;
		for( i=1;i<n;++i)
		{
			int key=a1[i];
			j=i-1;
			while(j>=0 && a1[j]>key)
			{
				a1[j+1]=a1[j];
				j=j-1;
				System.out.print("\n"+i+" itration ");
				display(a1);
				System.out.println();
			}
			a1[j+1]=key;
			//System.out.print("\n"+i+" itration ");
			System.out.println();
			display(a1);
			//System.out.println();
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
		iSort(a1);
		System.out.println("\nAfter applying Insertion sorting:");
		display(a1);
	}
}	