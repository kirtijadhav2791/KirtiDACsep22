class LinkedListNo_Node_LengthLL
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
	
	//Count number of node in list or length of node
	static void countLengthOrNode()
	{
		Node temp=head;
		int count=0;
		
		while(temp!=null)
		{
			count ++;
			temp=temp.next;
		}
			System.out.println("Number of node or Length of list is: "+count);
	}

		// recursive method for finding length or no node
		static int countRecurtion(Node temp)
		{
				
				if(temp==null)
					System.out.println("list is empty");
				return countRecurtion(temp.next);
				//System.out.println("Number of node or Length of list using recursion: "+n);
		}
		
		//serch node
		static void searchNode(Node head,int key)
		{
			Node temp= head;
			
		
			while(temp!=null)
			{
				if(temp.data==key)
				{	
					System.out.println("\nNode found");
					return;
				
				}
				temp=temp.next;
			}
			
			System.out.println("\nNode is not found");
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
		
		 countLengthOrNode();
		 display();
		System.out.println("\n");
		
		searchNode(head,11);
		System.out.println("\n search node");
		searchNode(head,20);
	
	}
}
		
		
		