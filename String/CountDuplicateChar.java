/*7. You need to write a program to print all duplicate character and their count in Java. For 
example, if given String is "Programming" then your program should print
g : 2
r : 2
m : 2*/

import java.util.*;
class CountDuplicateChar
{
	public static void main(String args[])
	{
		int count,n,i,j;
		char ch[];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string to find duplicate in string");
		String str=sc.next();
		n=str.length();
		ch=str.toCharArray();
		
		System.out.println("Duplicate in strings are");
		for( i=0;i<n;i++)
		{
			count=1;
			for( j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					//ch[j]=0;
				}
			}
				if(count>1)
				{
				  System.out.println(ch[i]+ " = "+count);
				}
		}
		
	}
}	