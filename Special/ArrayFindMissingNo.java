/*17. Find the missing number in an Array between 1 to 100. Given only one number is 
missing*/

import java.util.*;
class ArrayFindMissingNo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,size=101,sum=0,sum1=0;
		
		Random r = new Random();
        int myRandInt = r.nextInt(100);
        myRandInt = myRandInt+1;
		
		
		int arr[]=new int[size];
		int temp[]=new int[size];
		
		for(i=1;i<=size-1;i++)
		{
			arr[i]=i;
		
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		/*System.out.print("\nEnter number for delete");
		int delete=sc.nextInt();*/
		System.out.print("\nRandome number :"+myRandInt);
		System.out.println(" ");
		//System.out.println(" ");
		for(i=1;i<=size-1;i++)
		{
			   if(arr[i]!=myRandInt)
			   {
				
				temp[i]=arr[i];
		        System.out.print(temp[i]+" ");
			   }
		}			
		
		for(i=1;i<=size-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(" ");
		//System.out.println("sum= :"+sum);
		for(i=1;i<=size-1;i++)
		{
			sum1=sum1+temp[i];
			
		}
		//System.out.println("sum= :"+sum1);
		int res=sum-sum1;
		System.out.println(" ");
		System.out.println("missing no is:"+res);
	}
}
		
		