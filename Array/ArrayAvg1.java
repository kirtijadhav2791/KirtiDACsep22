public class ArrayAvg1
{
    static void newArr(int arr1[])
	{
 
        int n = arr1.length;
		int sum=0,avg=0;
        int newarr[] =new int[n];
		System.out.println("Elements in array:");
	
	    for(int i=0; i<n; i++)
		System.out.print(arr1[i]+ " ");
		System.out.println(" ");
		
         if(n==2)
		{
			System.out.println("Array size is smaller than 3");
		}
		else
		{
			System.out.println("\nAfter calculate average of 3 consecutive integers ");
			
			for(int i=0; i<n-2; i++)
			{
				//int k=0;
				for(int j=i; j<n-1;j++)
	   
				 {
					 
					 sum=(arr1[i])+(arr1[i+1])+(arr1[i+2]);
					 //sum=sum+arr1[j];
					 avg=sum/3;
					 //k++;
					  //newarr[i] =(arr1[j]+arr1[j+1]+arr1[j+2]);
					  
				 }
				 System.out.print(avg+ " ");
				
			}
		}
	}
		public static void main(String[] args)
		{
			int arr1[]={23,60,94,3,102,2,5,6};
			 newArr(arr1);
		 }
}