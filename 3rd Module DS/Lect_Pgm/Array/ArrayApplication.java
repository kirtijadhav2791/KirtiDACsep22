import java.util.*;
class ArrayApplication
{
	
	
	static int a1[];
	static int n;
	ArrayApplication(int max)
	{
		a1 = new int[max];
		n=0;
	}
	static boolean find(int key)
	{ 
		//search
		int i;
		for( i=0; i<n; i++)  
			
				if(a1[i] == key){
					System.out.println("Element " +key+"  found at  index no: "+i );
				break;
			}
				
				 if(i == n)
					 return false;
				 else
					return true;
	}	
	static void insert()
	{
		    Scanner sc = new Scanner(System.in);
		    
			System.out.print("Enter the number of elements you want's to add : ");
		    int a=n;
			int m=sc.nextInt();
			System.out.println("Enter elements to be inserted : ");
			for(int i=a; i<m+a; i++)
			{
			a1[i] =sc.nextInt();
			
			n++;
			}				
	}
	
	
	static boolean delete()
	{
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.println("Enter the element you want to be delete : ");
			int m = sc.nextInt();
			for( i=0; i< m; i++)
		
			if(a1[i] == m){
				System.out.println(m+" is Element Deleted ");
				break;
			}
			
		if(i == n)
			return false;
		else
		{
			for(int k = i; k<n ; k++)
				a1[k] = a1[k+1];
			n--;
			return true;			
		}	
	}	

	static void display()
	{
		//display
		
		if(n==0)
			System.out.println("Array is Empty! ");
		else
		{
			System.out.println("Array Elements are : ");
		
			for(int i=0; i<n; i++)
			{
				System.out.println(a1[i]+" ");
			}
		}			
	}


	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Array : ");
		int size = sc.nextInt();
		
		ArrayApplication a1 = new ArrayApplication(size);
		
		int ch;
		do{
			
				System.out.println("Enter your choice");
				System.out.println("1. Insert");
				System.out.println("2. Serching");
				System.out.println("3. Delete");
				System.out.println("4. Display");
				System.out.println("5. Exit");
				
				System.out.print("Your choise is : ");
				
				 ch = sc.nextInt();
				switch (ch)
				{
					case 1: insert();
							break;					
					case 2: System.out.println("enter no to be search");
							int k = sc.nextInt();	
							System.out.println(find(k));
							break;
					
					case 3:  delete();
							 break;
					
					case 4:  display();
							 break;
							
					case 5: System.out.println("Exited");		
							break;
					default: System.out.println("Enter valid choice");
				}
				System.out.println("------------------------------------------------------");

			}while(ch!=5);
			    System.out.print("-----------------   Thank You  -------------------------");
	}
	
}