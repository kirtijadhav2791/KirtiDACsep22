import java.util.*;
class ReverseStack
{
	
	static int top;
	static char ch[];
	
	ReverseStack()
	{
		top=-1;
	}
	 /*static void isEmpty()
	 {
		 if(top<0)
		System.out.println("Stack is empty");
	 }*/
	 static void push(String s,int n)
	{
			ch=new char[n];
		  for(int i=0;i<n;i++)
		  {
			  
			  ch[i]=s.charAt(i);
			  ch[top]=ch[i];

			  System.out.println("value top "+top);
			  top++;
		  }

		  System.out.println("Your string is");
		  for(char c:ch)
		  {
			  System.out.print(c);
		  }
		  	
	}
	
	static void pop()
    { 
		//isEmpty();
		char x;
		for(int i=top;i>0;i--)
		{	--top;
				
			x=ch[top];
			System.out.print(x);
			//System.out.println("value top "+top);
			
		} 
	  }
	public static void main(String args[])
	{
		System.out.println("Enter string to push: ");
		Scanner sc=new Scanner(System.in);
		  //System.out.println("Enter String");
		  String s=sc.next();
		  int n=s.length();
		push(s,n);
		System.out.println("\nstring after reverse");
		pop();
	}
}