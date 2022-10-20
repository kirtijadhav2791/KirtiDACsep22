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
	public boolean equals(Object ob)
	{
		//System.out.println("\n equals called :");
		Item i=(Item)ob;
		if(i==null)
			return false;
		if(this.itemId==i.itemId && this.itemName.equals(i.itemName) )
			return true;
		else
			return false;
}
}
	  
	  class ArrayListExamPrac2   
{
		public static void main(String args[])
		{	
				List<Item>itemList=new ArrayList<Item>();
				//List<Item>itemList1=new ArrayList<Item>();
				int ch;
				Scanner sc=new Scanner(System.in);
				System.out.println("\nEnter Your choice:");
				System.out.println("1.Add Item");
				System.out.println("2.Display complete inventory in sorted order of item names as well as itemId");
				System.out.println("3.Remove Item");
				System.out.println("4.Exit");
				
				
				itemList.add(new Item(1,"Fan"));
				itemList.add(new Item(2,"Chilli"));
				itemList.add(new Item(3,"Rice"));
				itemList.add(new Item(4,"Iorn"));
				itemList.add(new Item(5,"Nuts"));
				itemList.add(new Item(3,"Rice"));
				itemList.add(new Item(4,"Iorn"));
				itemList.add(new Item(7,"Chocolate"));
				System.out.println(".....Item list....");
				for(Item i:itemList)
				{
					System.out.println(i);
				}	
				
					System.out.println("\n.....Item list Af....");
					List<Item>itemList1=new ArrayList<Item>(itemList);
				Iterator<Item> it =itemList.iterator();
		         while(it.hasNext())
		         {
					Item i1=it.next();                                                 
					if(!itemList.contains(i1))
					{	
						itemList1.add(i1);
					}	
					
					 System.out.println(i1);
				 }
		}
			   
}
		/* Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) 
        it.remove();*/		