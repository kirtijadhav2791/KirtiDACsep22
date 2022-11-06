class LinkedListInsertionOperation
{
	static Node head;
	
	static class Node  //for create a  new node
	{
		
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	//.......Insert Node at Begining
	
	static void insertionAtBeg(int new_data)
	{
		Node new_Node=new Node(new_data);
		
		new_Node.next=head;
		head=new_Node;
	}
		
		//.......Insert Node at End
		
	static void insertionAtEnd(int new_data)
	{
		Node new_Node=new Node(new_data);
		 Node n=head;
		 if(head==null) //if list is empty ...new node is my first
		 {
			 head=new_Node;			 //head is point to the new node
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
	
	
	//.......Insert Node Between two Node
	
	static void insertionBetweenNode(Node prev,int new_data)
	{
		Node new_Node=new Node(new_data);
		//prev=head;
		
		new_Node.next=prev.next;
		prev.next=new_Node;
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
		}
	public static void main(String args[])
	{
		 //LinkedListInsertionOperation li=new  LinkedListInsertionOperation
		
		System.out.println("\nList is Empty\n");
			display();
		insertionAtBeg(11);
		insertionAtBeg(21);
		insertionAtBeg(31);
		insertionAtBeg(41);
		insertionAtBeg(51);
		System.out.println("List  After Insertion at Begining");
		display();
		System.out.println("\n");
		insertionAtEnd(61);
		insertionAtEnd(71);
		insertionAtEnd(81);

		System.out.println("\nList  After Insertion at End");
		display();
		System.out.println("\n");
		
		insertionBetweenNode(head,91);
		insertionBetweenNode(head,101);
		insertionBetweenNode(head.next.next,111);
		insertionBetweenNode(head.next,121);
		System.out.println("\nList  After Insertion In between Node");
		display();
		System.out.println("\n");
	}
}
		
		
		