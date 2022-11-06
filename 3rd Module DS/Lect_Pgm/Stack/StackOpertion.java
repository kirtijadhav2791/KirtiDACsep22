class StackOpertion
{
	static final int max=10;
	static int top; //which element on stack top
	static int s[]=new int[max]; //size of stack
	
	StackOpertion()
	{
		top=-1;
	}
	 
	 static void isEmpty()
	 {
		 if(top<0)
			 System.out.println("Stack is empty");
	 }
	 
	 //insert element in stack push operation
  static void push(int x)
  {
	  if(top>max-1) //stack full
	  {
	  System.out.println("....Stack overflow....");
	  return;
	  }
    
	  else
	  {
		  //top++; //becoz at start top is -1 so 1st increment top and then insert value
		  
		 s[++top]=x;
		  System.out.println(" Element Push: "+x);
		  return;
	  }
  } 
		  
		  //Remove element from stack pop operation
  static void pop()
  {
	  if(top<0) 
	  {//stack empty
	  System.out.println("....Stack underflow....");
		return;
	  }
	
	  else
	  {
		  //remove element from top of stack 
		  
		  int x=s[top--];
		   //top--;
		  System.out.println(" Element Pop: "+x);
		  return;
	  }
  } 
		  
		  //if satck is empty
		   static void isFull()
	 {
		 if(top==(max-1))
			 System.out.println("Stack is Full");
	 }
	 
	 //peek current element in stack
	 
	 static void peek()
	 {
		 if(top<0)
			 System.out.println("....Stack underflow....");

		else
		{
			int x=s[top];
			 System.out.println(" Element peek from Stack is: "+x);
		}
	 }
	public static void main(String args[])
	{
		push(11);
		push(21);
		push(31);
		push(41);
		push(51);
		push(61);
		//push(71);
		pop();
		pop();
		pop();
	}	
}