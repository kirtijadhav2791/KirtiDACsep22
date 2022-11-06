class QuickSort
{
		static void qSort(int a1[],int lowest,int highest)
		{
			if(lowest<highest)
			{
				int pi=partition(a1,lowest,highest);
				qSort(a1,lowest,pi-1); //left side
				qSort(a1,pi+1,highest); //right side
				System.out.println();
				System.out.println("\npasses");
				System.out.println();
				display(a1);
		
			}
 		}
		
		static int partition(int a1[],int lowest,int highest)
		{
			int pivote=a1[highest];
			int i=(lowest-1);
			
			for(int j=lowest;j<highest;j++)
			{
				if(a1[j]<pivote)
				{
					i++;
					swap(a1,i,j);
				}
			}
			swap(a1,i+1,highest);
			return (i+1);	
		}
		static void swap(int a1[],int i,int j)
		{
			int temp=a1[i];
			a1[i]=a1[j];
			a1[j]=temp;
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
			int n=a1.length;
			System.out.println("\nBefore sorting:\n");
			display(a1);
			qSort(a1,0,n-1);
			System.out.println("\nAfter applying Quick sorting:");
			display(a1);
		}
}	