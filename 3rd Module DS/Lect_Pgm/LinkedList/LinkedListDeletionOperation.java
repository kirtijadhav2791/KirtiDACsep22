class LinkedListDeletionOperation
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
	
	
	//.......Deletion opration
	static void deletionOperation(int key)
	{
		Node temp=head;
		Node prev=null;
		
		if(temp!=null && temp.data==key)
		{
			head = temp.next; //shiffting head to next element
			return;
		}
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
		{
			//System.out.println("List is empty");
			return;
		}	
		prev.next=temp.next;
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
		
		insertionAtBeg(41);
		insertionAtBeg(51);
		System.out.println("List  After Insertion at Begining");
		display();
		System.out.println("\n");
		insertionAtEnd(61);
		
		insertionAtEnd(81);

		System.out.println("\nList  After Insertion at End");
		display();
		System.out.println("\n");
		
		insertionBetweenNode(head,91);
		insertionBetweenNode(head.next,101);
		insertionBetweenNode(head.next.next,111);
		
		System.out.println("\nList  After Insertion In between Node");
		display();
		System.out.println("\n");
		
		//delete first node
		deletionOperation(51);
		System.out.println("\nList  After deletion of first node");
		display();
		System.out.println("\n");
		
		//delete last node
		deletionOperation(81);
		System.out.println("\nList  After deletion of last node");
		display();
		System.out.println("\n");
		
		//delete between node
		deletionOperation(31);
		System.out.println("\nList  After deletion mid node");
		display();
		System.out.println("\n");
	}
}
		
		
		