import java.util.*;
class Item
{
	  int itemId;
	  String itemName;
	  
	  Item()
	  {
	  }
	  Item(int itemId,String itemName)
	  {
		this.itemId=itemId;
		this.itemName=itemName;
	  }
	  public String toString()
	{
		return "Item[ItemId  "+itemId+" ,ItemName=  "+itemName+"]";  
    }
	public int hashCode()
	{
		return (itemId);
	}
	public boolean equals(Object ob)
	{
		System.out.println("\n equals called :");
		Item i=(Item)ob;
		if(i==null)
			return false;
		
		if(this.itemId==i.itemId && this.itemName.equals(i.itemName) )
			return true;
		else
			return false;
	}

}
class ArrayListExamPrac    
{
		public static void main(String args[])
		{	
				List<Item>itemList=new ArrayList<Item>();
				int ch;
				 ArrayListExamPrac ae=new  ArrayListExamPrac();
				Scanner sc=new Scanner(System.in);
				System.out.println("\nEnter Your choice:");
				System.out.println("1.Add Item");
				System.out.println("2.Display complete inventory in sorted order of item names as well as itemId");
				System.out.println("3.Remove Item");
				System.out.println("4.Exit");
				ch=sc.nextInt();
				do
				{
					switch(ch)
					{
						case 1:
								System.out.println("Add Item");
								System.out.println("Enter ItemId and ItemName");
								ae.addItem();
								Item in=new Item(sc.nextIit(),sc.next());
								ch=sc.nextInt();
								break;
						case 2:
								System.out.println("Display Item");
					}
				}
		}
}