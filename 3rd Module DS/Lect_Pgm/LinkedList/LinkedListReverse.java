class LinkedListReverse
{
	static Node head;
   static class Node
  {	
	int data;
	Node next;
	
	Node(int d)
	{
		data=d;
		next=null;
	}
}

static void insertionAtEnd(int new_data)
	{
		Node new_Node=new Node(new_data);
		 Node n=head;
		 if(head==null) //if list is empty ...new node is my first
		 {
			 head=new_Node;	 //head is point to the new node
			 return;
		 }
			
			//if list is not empty then
			while(n.next!=null)
			{
				n=n.next;
			}
				n.next=new_Node;
				new_Node.next=null;
				return;
	}
	
	static void display()
		{
			Node n=head;
			while(n!=null)
			{
				System.out.print(n.data+"--->");
				n=n.next;
			} 
			//System.out.print("\nNo element in list");
			//return;
		}

//reverse LikedList
static Node reverseLL()
{
		Node prev=null;
		Node current=head;
		Node next=null;
		
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		head=prev;
		//System.out.print("| "+head+" |");
		return head;
}	
		public static void main(String args[])
		{
			//display();
			//System.out.println("\nList is Empty\n");
			
			System.out.println("Element in LinkedList:");
				insertionAtEnd(10);
				insertionAtEnd(20);
				insertionAtEnd(30);
				insertionAtEnd(40);
				insertionAtEnd(50);
				display();
				System.out.println();
				System.out.println("\nReverse LinkedList:");
				reverseLL();
				display();
		}
}		