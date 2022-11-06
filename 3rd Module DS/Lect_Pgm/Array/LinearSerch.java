class LinearSerch
{
	 static int lSearch(int a1[],int x)
	{
		int n=a1.length;
		for(int i=0;i<n;i++)
		{
			if(a1[i]==x)
				return i;
		}
			return -1;
	}
	public static void main(String args[])
	{
		int a1[]={1,2,5,6,7,8};
		int x=5; //serch key
		//Scanner sc=new Scanner(System.in);
		int res=lSearch(a1,x);
		if(res==-1)
			System.out.println(" Element Not Found...");
		else
			System.out.println(" Element Found at index:"+res);
	}
}	
		
	