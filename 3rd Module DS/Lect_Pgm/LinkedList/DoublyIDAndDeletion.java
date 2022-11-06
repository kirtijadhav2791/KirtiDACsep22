class DoublyIDAndDeletion
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
	static void insertionInDL(int new_data)
	{
		Node new_Node= new Node(new_data);
		new_Node.next=head;
		//new_Node.next=null;
		if( head!=null)
			head.prev=new_Node;
			head=new_Node;
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
		}
	
	static void deleteNode(int new_data) //pass element which you want to delete 
	{
		Node temp=head;
		if(head==null || temp==null) 
				return;
			
		//delete first element	
		if(head==temp)
		{
			head=temp.next;
			head.prev=null;
		}

		//last node in list
		if(temp.next!=null) //if temp next is null then element is not 
		{
			temp.next.prev=temp.prev;
		}
		if(temp.prev!=null) //if we not write this then it gives problem to delete 1st node
		{
			temp.prev.next=temp.next;
		}
			return;
	}		
		
		public static void main(String args[])
		{
			
			insertionInDL(10);
			insertionInDL(20);
			insertionInDL(30);
			insertionInDL(40);
			insertionInDL(50);
			//display(dl.head);
			System.out.println("List  After Insertion at Begining");
			//System.out.println("");
			display(head);
			System.out.println("");
			
			deleteNode(50);
			System.out.println(" After delete 50");
			display(head);
			System.out.println("");
		}
}	