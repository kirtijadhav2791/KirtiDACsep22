/*1. Note: a palindrome is a sequence of characters that reads the same forwards and 
backwards.
Ex: Given the following strings...
"A man, a plan, a canal: Panama.", return true*/

import java.util.*;
class PalindromeSequenceChar
{
	static boolean stringPalindrome(String str)
	{
		int n=str.length();
		int low=0;
		int high=n-1;
		str=str.toLowerCase();
		
		while(low<=high)
		{
			char lowchar=str.charAt(low);
			char highchar=str.charAt(high);
			
			if(!(lowchar>='a' && lowchar>='a'))
			{
				low++;
			}
			else if(!(highchar>='a' && highchar>='a'))
			{
				high--;
			}
			
			else if(lowchar==highchar)
			{
				low++;
				high--;
			}
			
			else
				return false;
		}
			return true;
	}
			
	
	
	public static void main(String args[])
	{
		String str;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String:");
		
		str=sc.nextLine();
		
		System.out.println(stringPalindrome(str));
	}
}