class DoublyInsertionAndDeletion
{
	static Node head;
	
	static class Node
	{
		int data;
		Node prev;
		Node next;
		
		Node(int d)
		{
			data=d;
			prev=next=null;
		}
	}		
	
	//Insertion at beg
	
	static void insertionInDL(int new_data)
	{
		Node new_Node= new Node(new_data);
		new_Node.next=head;
		//new_Node.next=null;
		if( head!=null)
			head.prev=new_Node;
			head=new_Node;
	}

	//Insertion at end
	
	static void append(int new_data)
	{
		Node new_Node= new Node(new_data);
		new_Node.next=null;
		 
		Node temp=head;
		
		if(head==null)
		{
			new_Node.prev=null;
			head=new_Node.next;
			return;
		}
		while(temp.next!=null) //we r checking temp.next becoz..if we r cheching temp then one more itration is need and at that point temp pointing  //to null
		
		{
			temp=temp.next;    //temp next jo ahe to temp assign hoto
		}
			temp.next=new_Node; //above condition flase zali tyanantr this step ->temp next to new node assign krnar
			new_Node.prev=temp; //now new is become my last node in that prev temp link was stored
	}	

		static void insertionInBetween(int new_data,Node temp)  //temp for triversing list
		{
			if(head==null) //list is empty
				return;
				
			Node new_Node= new Node(new_data);
			new_Node.next=temp.next;
			temp.next=new_Node;
			new_Node.prev=temp;
			new_Node.next.prev=new_Node;
		}
		
		static void display(Node n)
		{
			 n=head;
			Node last=n;
			System.out.println("\n.......Doubly LinkedList in forword direction....");
			while(n!=null)
			{
				System.out.print(n.data+"--->");
				
				last=n;
				n=n.next;
				
				//return;
			}
		/*	System.out.println(" ");
			System.out.println("\n.......Doubly LinkedList in Backword direction....");
			while(last!=null)
			{
				System.out.print(last.data+"--->");
				last=last.prev;
				//return;
			}*/
		}
		public static void main(String args[])
		{
			DoublyInsertionAndDeletion dl=new DoublyInsertionAndDeletion();
		
			insertionInDL(10);
			insertionInDL(20);
			insertionInDL(30);
			insertionInDL(40);
			insertionInDL(50);
			//display(dl.head);
			System.out.println("List  After Insertion at Begining");
			//System.out.println("");
			display(dl.head);
			System.out.println("");
			
			/*append(100);
			append(90);
			append(80);
			append(70);
			append(60);
			System.out.println("List  After Insertion at Last");
			//System.out.println("");
			display(dl.head);	
			System.out.println("");*/
			
			insertionInBetween(1,head);
			display(dl.head);
			insertionInBetween(2,head.next);
			display(dl.head);
			insertionInBetween(3,head.next.next);
			//insertionInBetween(4,head);
			//insertionInBetween(5,head);
			System.out.println("Insertion between node");
			//System.out.println("");
			display(dl.head);
		}
}		