class DoublyLinkedlist
{
   static Node head;
   
   static class Node
	{
		int data;
		Node next;
		Node prev;
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
/*
static void insertionAtBeg(int new_data)
	{
		Node new_Node=new Node(new_data);
		
		new_Node.next=head;
		head=new_Node;
	}*/
static void display()
{
		Node n=head;
		Node last=n;
		System.out.println("\n.......Doubly LinkedList in forword direction....");
		while(n!=null)
		{
			System.out.print(n.data+"--->");
			
			last=n;
			n=n.next;
			
			//return;
		}
		System.out.println(" ");
		System.out.println("\n.......Doubly LinkedList in Backword direction....");
		while(last!=null)
		{
			System.out.print(last.data+"--->");
			last=last.prev;
			//return;
		}
}
	public static void main(String args[])
	{
		DoublyLinkedlist dl=new DoublyLinkedlist();
	
		insertionInDL(10);
		insertionInDL(20);
		insertionInDL(30);
		insertionInDL(40);
		insertionInDL(50);
		//display(dl.head);
		System.out.println("List  After Insertion at Begining");
		display();
	}
}	
