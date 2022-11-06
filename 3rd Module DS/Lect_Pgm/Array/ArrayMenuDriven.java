import java.util.*;
class ArrayMenuDriven
{
	    Scanner sc=new Scanner(System.in);
		 int num;
		int i;
		int a1[];
		
		
		void insertElement()
		{
			  
			 //int a1[]=new int[num];
			System.out.println("Enter Number of element:");
	         num=sc.nextInt();
			 a1=new int[num];
			  System.out.println("\nEnter element of aaray:");
			
			for(int i=0;i<num-1;i++)
			{
			   a1[i]=sc.nextInt();
			   num++;
			} 
			
			
		}
	
		void displayElement()
		{
			System.out.println("\nElements in array:");
			for( i=0;i<num;i++)
			{
				System.out.println(a1[i]+" ");
			}	
			System.out.println();
		}	
		
		
		void deleteElement()
		{
			System.out.println("\nEnter element for delete:");
			int n=sc.nextInt();
				for(i=0;i<num;i++)
				{
					if(a1[i]==n)
					{
						System.out.println(n+" Deleted");
					}
				}	
				if(i==num)
				{
					
				}  //System.out.println("Last element in aaray");
				else
					for(int k=i;k<num;k++)
					{
						a1[k]=a1[k+1];
						num--;
					}
					
			}
			
			
			void searchElement()
			{
				System.out.println("\nEnter element for serach");
				int a=sc.nextInt();
				 
				for(i=0;i<num;i++)
				{
					if(a1[i]==a)
					{
						System.out.println("Element found");
					     //break;
					}	 
				}
		
						//System.out.println("Element not found");
				
					
			}
				
			void exit()
			{
				System.out.println("Sorry..You Are exit");
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
		