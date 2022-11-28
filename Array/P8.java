/*
Write a program which takes an array of integers and prints the running average of 3 consecutive integers.
In case the array has fewer than 3 integers, there should be no output.
Input: [5,14,35,89,140]
Output: [18, 46, 88]
(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)

*/


public class P8
{
	
	static int[] newArr(int a[]){
	int n = a.length;
		
		int b[] = new int[3];
		
		int i = 0;
		int j = 0;
		
		while(n >= 3){
			int sum = 0;
			sum = a[i] + a[++i] + a[++i];
			b[j] = sum/3;
			j++;
			i = j;
			n--;
		}return b;
	
	}
	
   public static void main(String args[]){
		
		int a[] = { 5,14,35,89,140 };
		
		int b[] = newArr(a);
		System.out.println("Array of sum is : ");
		for(int x : b){
			
			System.out.println(x);
		}
   }
}