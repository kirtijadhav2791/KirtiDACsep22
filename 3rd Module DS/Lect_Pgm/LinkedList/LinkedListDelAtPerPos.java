class LinkedListDelAtPerPos
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
	
	
	//.......Delete node at perticuler position
	static void deleteAtperPos(int position)
	{
		if(head==null)
			return;
		
		Node temp=head;
		 
		 //delete at beginging position
		 
		 if(position==0)
		 {
			 head=temp.next;
			 return;
		 } 
		
		// loop for reach that perticuler node
		for(int i=0;temp!=null && i<position-1;i++)
		{
			temp=temp.next;
		}
		
		if(temp==null || temp.next==null)
		{
			System.out.print("....."+temp.data);
			return;
		} 
		Node n=temp.next.next;
		temp.next=n;
	}
	
	//delete entire list
	
	static void deleteList()
	{
		head=null;
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
		display();
		System.out.println("\n");
		
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
		/*
		insertionBetweenNode(head,91);
		insertionBetweenNode(head.next,101);
		insertionBetweenNode(head.next.next,111);*/
		
		System.out.println("\nList  After Insertion In between Node");
		display();
		System.out.println("\n");
		
		/*deleteAtperPos(3);
		System.out.println("\nList  After delete node at position 3");
		display();
		System.out.println("\n");
		
		deleteAtperPos(0);
		System.out.println("\nList  After delete node at position 0");
		display();
		System.out.println("\n");*/
		
		/*deleteAtperPos(7);
		System.out.println("\nList  After delete node at position 7");
		display();
		System.out.println("\n");*/
		deleteAtperPos(4);
		System.out.println("\nList  After delete node at position 7");
		display();
		System.out.println("\n");
		
		
		/*deleteList();
		System.out.println("\nEntire list was deleted");
		System.out.println("\n");*/
		
	/*	//tring to insert after deleteing entire list
		insertionBetweenNode(head,91);
		//insertionBetweenNode(head.next,101);
		//insertionBetweenNode(head.next.next,111);
		System.out.println("\nInsertion after deleting entire list");
		display();
		System.out.println("\n");
*/
	}
}
		
		
		