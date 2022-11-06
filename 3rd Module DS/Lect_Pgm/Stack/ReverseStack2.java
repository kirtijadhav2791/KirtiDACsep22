import java.util.*;
class ReverseStack2
{
	
	static int top;
	static char ch[];
	static int n;
	
	
		
	ReverseStack2(int n)
	{
		top=-1;
		ch=new char[n];
	
	}

	 
	 static void push(char s)
	{
		  if (top > n) {
            System.out.println("Stack Overflow");
            return;
			}
		  
		   
		  for(int i=0;i<n;i++)
		  {
			  top++;
			ch[top]=ch[i];
			
		  
		 	//top++;
		  }
		 // System.out.print("Your string:"+ch[top]);
	}
	
	static boolean isFull()
	{
		return (top == (n-1));
	}
	static void pop()
    {
		  for(int i=top;i>=0;i--)
		  {  
			char x=ch[top];
			--top;
		    System.out.print(x);
		  }	
	}
	  
	  // static void push(char value) {
       // if(!isFull()) {
            // ch[++top] = value;
        // }

	public static void main(String args[])
	{
		System.out.println("Enter string to push: ");
		Scanner sc=new Scanner(System.in);
		 ReverseStack2 a =new ReverseStack2(n);
		
		String str = sc.next();
		ch = str.toCharArray();
        n = ch.length; 
		int i;
        for(i = 0; i < n; ++i) {
            push(ch[i]);
        }

        for(i = 0; i < n; ++i) {
           pop();
        }	
	}
}