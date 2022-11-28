import java.util.*;
public class P9
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int a = 1;
     	for(int i=1; i<=n; i++)
     	{
     		if(i%2==0)
     		{
     		    	System.out.print(a*a+", ");
     		     a++;
     		}
     		else 
     		{
     		    	System.out.print(a*a*a+", ");
     		     a++;
     		}
		
	
		
     	}
	}
}
