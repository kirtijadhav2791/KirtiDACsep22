import java.util.*;
class ArrayMenuDriven
{
	    Scanner sc=new Scanner(System.in);
		 int num=0;
		int i;
		int a1[];
		
		
		void insertElement()
		{
			  
			 //int a1[]=new int[num];
			System.out.println("Enter Number of element:");
	         int no=sc.nextInt();
			 a1=new int[no];
			 int a=num;
			  System.out.println("\nEnter element of aaray:");
			
			for(int i=a;i<no+a;i++)
			{
			   a1[i]=sc.nextInt();
			   num++;
			} 
			
			
		}
	
		 void displayElement()
		{
			if(num==0)
			System.out.println("Array is Empty! ");
		    else
			{
				System.out.println("\nElements in array:");
				for( i=0;i<num;i++)
				{
					System.out.println(a1[i]+" ");
				}	
			}
			System.out.println();
		}	
		
	 boolean deleteElement()
		{
			System.out.println("\nEnter element for delete:");
			int n=sc.nextInt();
				for(i=0;i<n;i++)
					if(a1[i]==n)
					{
						System.out.println(n+" Deleted");
						break;
					}	
				if(i==num)
				return false;
	        	else
				{
					for(int k = i; k<num-1 ; k++)
					a1[k] = a1[k+1];
					num--;
					return true;			
				}	
					
			}
			
			
			 boolean searchElement()
			{
				//search
		        int i,key;
				System.out.println(" Enter Element for delete");
				key=sc.nextInt();
		        for( i=0; i<num; i++)  
			
				if(a1[i] == key)
				{
					System.out.println("Element " +key+"  found at  index no: "+i );
				    break;
				}
				
				 if(i == num)
					 return false;
				 else
					return true;
				}
				
			void exit()
			{
				System.out.println("You exit");
			}	
				
		
	public static void main(String args[])
	{
		ArrayMenuDriven am=new ArrayMenuDriven();
		
		
		
	    int choice;
		
		Scanner sc1=new Scanner(System.in);
		
		
		
		System.out.println("\n Enter you choice:");
		System.out.println("1.Insert");
		System.out.println("2.Display");
		System.out.println("3.Search");
		System.out.println("4.Delete");
		System.out.println("5.Exit");
		choice=sc1.nextInt();
		
		//System.out.println("\nElement inserted succefully:");
		 
		do
		{
			switch(choice)
			{
				case 1:
						am.insertElement();
					    System.out.println("\n Enter you choice:");
						System.out.println("1.Insert");
						System.out.println("2.Display");
						System.out.println("3.Delete");
						System.out.println("4.Search");
						System.out.println("5.Exit");
						choice=sc1.nextInt();
		
						break;
				case 2:
						am.displayElement();
						System.out.println("\n Enter you choice:");
						System.out.println("1.Insert");
						System.out.println("2.Display");
						System.out.println("3.Delete");
						System.out.println("4.Search");
						System.out.println("5.Exit");
						choice=sc1.nextInt();
						break;
				case 3:
						am.deleteElement();
						System.out.println("\n Enter you choice:");
						System.out.println("1.Insert");
						System.out.println("2.Display");
						System.out.println("3.Delete");
						System.out.println("4.Search");
						System.out.println("5.Exit");
						choice=sc1.nextInt();
						break;
				case 4:
						am.searchElement();
						System.out.println("\n Enter you choice:");
						System.out.println("1.Insert");
						System.out.println("2.Display");
						System.out.println("3.Delete");
						System.out.println("4.Search");
						System.out.println("5.Exit");
						choice=sc1.nextInt();
						break;
				case 5:
						am.exit();
						System.exit(0);
						//choice=sc1.nextInt();
						break;
				default:
						System.out.println("Enter wrong choice:");
						System.exit(0);
			}
		}while(choice!=0);
	}
}	
		