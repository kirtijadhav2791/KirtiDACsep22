class  LinkedList
{	
	Node head;
	
	static class Node  //for defining structure
	{
		
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	 void display()
		{
			Node n=head;
			while(n!=null)
			{
				System.out.print(n.data+"--->");
				n=n.next;
			}
		}
	public static void main(String args[])
	{
		LinkedList l1=new LinkedList();
		l1.head= new Node(11);
		
		Node second =new Node(22);
		Node third =new Node(33);
		Node forth =new Node(34);
		Node fifth =new Node(35);
		
		l1.head.next= second;
		second.next=third;
		third.next=forth;
		forth.next=fifth;
		
		System.out.println(l1.head+" "+second);
		l1.display();
	}
}	