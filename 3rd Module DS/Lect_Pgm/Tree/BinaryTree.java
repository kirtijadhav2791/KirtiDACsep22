class BinaryTree
{
	static Node root;
	 
	 static class Node
	 {
		int data;
		Node left;
		Node right;
		Node (int n)
		{
			data=n;
			left=right=null;
		}
	}
	
	//preOrder traversal
	static void printPreorder(Node n)
	{ 
		if(n==null)
			return;
		System.out.print(n.data+" ");
		printPreorder(n.left);
		printPreorder(n.right);
	}
	static void preOrder()
	{
		printPreorder(root);
	}	
	
	//Inorder 
	static void printInorder(Node n)
	{
		//Node n;
		if(n==null)
			return;
		
		printInorder(n.left);
		System.out.print(n.data+" ");
		printInorder(n.right);
	}
	static  void inOrder()
	{
		printInorder(root);
	}	
	
	//postorder
	static void printPostorder(Node n)
	{
		//Node n;
		if(n==null)
			return;
		
		printPostorder(n.left);
		printPostorder(n.right);
		System.out.print(n.data+" ");
	}
	static void postOrder()
	{
		printPostorder(root);
	}	
	
		
		
		BinaryTree()
		{
			root=null;
		}
		BinaryTree(int new_data)
		{
			root=new Node(new_data);
		}
	public static void main(String args[])
	{
		BinaryTree bt=new BinaryTree();
		
		root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		
		System.out.println("........Preorder Traversal.......");
		preOrder();
		System.out.println(" ");
		System.out.println("\n........Inorder Traversal.......");
		inOrder();
		System.out.println(" ");
		System.out.println("\n........Postorder Traversal.......");
		postOrder();
	}
}	
		
		
		
		
			