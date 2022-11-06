class BinaryTreeIncertionDeletion
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
	

	//insertion 
		
	static Node insertInBinaryTree(Node root, int key)
		{
			if(root==null)
			{
				root=new Node(key);
				return root;
			}
			if(key<=root.data)
			{
				root.left=insertInBinaryTree(root.left,key);
			}
			else
				root.right=insertInBinaryTree(root.right,key);
			return root;
		}
		
		static void insertion(int key)
		{
			root=insertInBinaryTree(root,key);
		}	
		
		//Deletion 
	static	Node printDelete(Node root,int key)
		{
			//check tree is empty or not
			if(root==null)
				return root;
			
				if(key<root.data) // tr to left sub tree madhe janar search kernar
					root.left=printDelete(root.left,key);
				
				else if(key>root.data) //tr to right subtree madhe janar search krnar
					root.right=printDelete(root.right,key);
			
			else
			{
				//case1. if node is leaf node , the left child and right child= null
				// also cover 2nd case i.e one child .... if we delete a node which has one node
				
				if(root.left==null) // replce with right node
				   return root.right;
				   
				else if(root.right==null) //replace with left node
					return root.left;
					
				//	case 3. Two children ... delete node which have two children
				
				root.data=minValue(root.right); 
				//when we delete a root node which have two children ...so the node which we want to replace with    
				//root node is always in right subtree minValue  
				
				root.right=printDelete(root.right,root.data); //now update tree and root.data => root.right store 
		}
			return root;
}

    static int minValue(Node root)
	 {
		 int x=root.data;
		 
		 while(root.left!=null) // right subtree madhe left cha smallest element milto
		 {
			 x=root.left.data; // jab tak smallest element value nahi milat toprant travrse krnar
			 root=root.left; //now root is left smallest element
		 }
			return x; //min value
	 }	
	
    static void delete(int key)
	{
		printDelete(root,key);
	}	
					
		BinaryTreeIncertionDeletion()
		{
			root=null;
		}
		BinaryTreeIncertionDeletion(int new_data)
		{
			root=new Node(new_data);
		}
	public static void main(String args[])
	{
		 insertion(10);
		 insertion(20);
		 insertion(30);
		 insertion(40);
		 insertion(50);
		 System.out.println(" ");
		 System.out.println("........Preorder Traversal.......");
		 preOrder();
		 System.out.println(" ");
		 System.out.println(" ......After Deletion......");
		 delete(40);
		 preOrder();
	}
}		