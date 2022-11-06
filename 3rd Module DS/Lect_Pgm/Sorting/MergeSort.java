class MergeSort
{
	 static void mSort(int a1[],int low,int high)
	{
		int n=a1.length;
		int j;
		if(low<high)
		{
			int mid=low+(high-low)/2;
			mSort(a1,low,mid);//left side
			mSort(a1,mid+1,high);//right side
			merge(a1,low,mid,high);
			System.out.println("\npasses");
			System.out.println();
			display(a1);
		}
	}	
	
	static void merge(int a1[],int low,int mid,int high)
	{
		int n1=mid-low+1;
		int n2=high-mid;
		
		
		int left[]=new int[n1];
		int right[]=new int[n2];
		
		for(int i=0;i<n1;i++)
			left[i]=a1[low+i];
		
		for(int j=0;j<n2;j++)
			right[j]=a1[mid+1+j];
		
		int k=low;
		int i=0,j=0;
		while(i<n1 && j<n2)
		{
			if(left[i]<right[j])
			{
				a1[k]=left[i];
				i++;
			}
			else
			{
				a1[k]=right[j];
				j++;
			}	
			k++;
		}
		while(i<n1)
		{
			a1[k]=left[i];
			i++;
			k++;
		}	
		while(j<n2)
		{
			a1[k]=right[j];
			j++;
			k++;
		}		
	}
				/*System.out.print("\n"+i+" itration ");
				display(a1);
				System.out.println();
			}
			System.out.println("\n....."+(i+1)+"  Pass Completed....");
		}
		
	}*/
		
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
		mSort(a1,0,n-1);
		System.out.println("\nAfter applying merge sorting:");
		display(a1);
	}
}	