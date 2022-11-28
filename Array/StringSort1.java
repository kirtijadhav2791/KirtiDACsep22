class StringSort1
{
	public static void main(String args[])
	{
	   String str[]={"Kirti","Kamesh","Kamlesh","Kaustubh","Mohit"};
		//String temp;
		int n=str.length;
		String temp;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if((str[j].length())>((str[j+1].length())))
				{
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted String :");
		for(int i=0;i<n;i++)
		{
			System.out.print(str[i]+"  ");
		}
	}
}
				