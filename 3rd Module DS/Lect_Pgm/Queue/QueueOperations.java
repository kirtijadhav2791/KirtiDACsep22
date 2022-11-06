import java.util.*;
class QueueOperations
{
  static int q[];
  static int size;
  static int rear,front;
  
  QueueOperations(int a)
  {
	  size=a;
	  q=new int[size];
	  front=0;
	  rear=-1;
  }

	static void isFull()
	{
		if(rear>=size-1)
		{
			System.out.println(" Queue is full ");
		}
	}
	
	static void isEmpty()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println(" Queue is Empty ");
		 }
	 }
				
	static void enqueue(int x)
	{
		isFull();
		rear++;
		if(front ==0)
			//rear++;
		q[rear]=x;
		//System.out.println("Element Enqueue: "+x);
	}

    static void dequeue()
	{ 
	   int x;
		
		isEmpty();
		x=q[front];
		if(front>=rear)  //reset q position
		{
			front =-1;
			rear=-1;
		}
		else
		{
			front++;
		}
		// System.out.println("Element Dequeue: "+x);
	}
	
	static void display()
	{
		isEmpty();
		
		System.out.println("Element in Queue: ");
		for(int i=front;i<=rear;i++)
		{
			System.out.print(q[i]+ " ");
		}	
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Queue: ");
		int num=sc.nextInt();
		QueueOperations qo=new QueueOperations(num);
		enqueue(10);
		enqueue(20);
		enqueue(30);
		enqueue(40);
		enqueue(50);
		
		display();
		System.out.println(" ");
		System.out.println("\n....After Dequeue...");
		dequeue();
		dequeue();
		dequeue();
		dequeue();
		dequeue();
		dequeue();
		display();
	}
}	