class BinarySerch
{
	static int bSearch(int a1[],int x,int low,int high)
	{
		if(high>=low)
		{
			//int mid =(low+high)/2;
			int mid=low+(high-low)/2;
			//worst complexity O(log n)
			System.out.println("mid value:"+mid);
			if(a1[mid]==x)
			{
				return mid;
			}
			if(a1[mid]>x)
				return bSearch( a1,x,low,mid-1);
			
				return bSearch(a1,x,mid+1,high);
		}
			return -1;
		}
		
		public static void main(String args[])
	{
		int a1[]={10,20,50,60,70,80};
		int x=80; //serch key
		//Scanner sc=new Scanner(System.in);
		int n=a1.length;
		int res=bSearch(a1,x,0,n-1);
		if(res==-1)
			System.out.println(" Element Not Found...");
		else
			System.out.println(" Element Found at index:"+res);
	}
}	
		
