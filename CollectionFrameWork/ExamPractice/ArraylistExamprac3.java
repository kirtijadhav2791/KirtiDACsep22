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
class ArrayListExamPrac3    
{
		public static void main(String args[])
		{	
				List<Item>itemList=new ArrayList<Item>();
				
				
				itemList.add(new Item(1,"Fan"));
				itemList.add(new Item(2,"Chilli"));
				itemList.add(new Item(3,"Rice"));
				itemList.add(new Item(4,"Iorn"));
				itemList.add(new Item(5,"Nuts"));
				itemList.add(new Item(3,"Rice"));
				itemList.add(new Item(4,"Iorn"));
				itemList.add(new Item(7,"Chocolate"));
				
				System.out.println(".....Item list....");
				
				Iterator<Item>newList= itemList.iterator();
		
				while (newList.hasNext()) 
				{
					System.out.println(newList.next());
				}
				
				Set<Item> itemSet = new HashSet<Item>(itemList);
				Iterator<Item>newListSet= itemSet.iterator();
				
				System.out.println("\n.....Item list after using HashSet....");
			
				while (newListSet.hasNext()) 
				{
					Item i= newListSet.next();
					System.out.println(i);
		   
				}
				/*for(Item i:newList)
				{	
					System.out.println(i);
				}*/
		}
}		