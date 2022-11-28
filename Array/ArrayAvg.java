/*Write a program which takes an array of integers and prints the running average of 3 consecutive integers.
In case the array has fewer than 3 integers, there should be no output.
Input: [5,14,35,89,140]
Output: [18, 46, 88]*/

public class ArrayAvg
{
    static int[] newArr(int arr1[])
          {
               
                int n = arr1.length;
              int newarr[] =new int[n];
                
     	
     	for(int i=0; i<n-1; i=i+3)
     	{
     	     if(i== 2 )
     	     {
     	          newarr[i] = (arr1[i]+arr1[i-1]+arr1[i-2])/3;
				  i=2;
     	     }
			 else
				  newarr[i] = (arr1[i]+arr1[i-1]+arr1[i-2])/3;
     	}return newarr;
     }
	public static void main(String[] args) {
	int arr1[]={23,60,94,3,102,2,5,6};
	int ch[] = newArr(arr1);
	
	
	 
	     }
}