mport java.util.*;
class ReverseStack1
{
	
	static int top;
	static char ch[];
	static int n;
	
	
		
	ReverseStack1(int n)
	{
		top=-1;
		ch=new char[n];
	
	}

	 
	 // static void push(char s, int n)
	// {
		  // if (top > n) {
            // System.out.println("Stack Overflow");
            // return;
			// }
		  
		   
		  // for(int i=0;i<n;i++)
		  // {
			  // top++;
			// ch[top]=ch[i];
			// System.out.print("Your string:"+ch[top]);
		  
		  // //	top++;
		  // }
	// }
	
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
	  
	  static void push(char value) {
       if(!isFull()) {
            ch[++top] = value;
        }

	public static void main(String args[])
	{
		System.out.println("Enter string to push: ");
		Scanner sc=new Scanner(System.in);
		 ReverseStack1 a =new ReverseStack1(n);
		
		String str = sc.next();
		ch = str.toCharArray();
        n = ch.length; 
		int i;
        for(i = 0; i < n; ++i) {
            push(ch[i], n);
        }

        for(i = 0; i < n; ++i) {
           pop();
        }
		  
		
		
	}
}