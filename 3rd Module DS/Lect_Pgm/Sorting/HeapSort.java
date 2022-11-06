class HeapSort
{
	static void heapify(int a1[],int n,int i)
	{
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && a1[left]>a1[largest])
			largest=left;
		  System.out.print("Left large value:"+largest);
		   System.out.println();
		if(right<n && a1[right]>a1[largest])
			largest=right;
		System.out.print("Right large value:"+largest);
		System.out.println();
		if(largest!=i)
		{
			int temp=a1[i];
			a1[i]=a1[largest];
			a1[largest]=temp;
			heapify(a1,n,largest);
		}
	}
	static void hSort(int a1[])
	{
			int n=a1.length;
			for(int i=n/2-1;i>=0;i--)
				heapify(a1,n,0);
			
			for(int i=n-1;i>=0;i--)
			{
				int temp=a1[0];
				a1[0]=a1[i];
				a1[i]=temp;
				
				heapify(a1,i,0);
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
			int n=a1.length;
			System.out.println("\nBefore sorting:\n");
			display(a1);
			hSort(a1);
			System.out.println("\nAfter applying Heap sorting:");
			display(a1);
		}
}	