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
	  
	  class ArrayListExamPrac1    
{
		public static void main(String args[])
		{	
				List<Item>itemList=new ArrayList<Item>();
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
				
				
				System.out.println(".....Item list after ....");
				
				Iterator<Item>newList= itemList.iterator();
		
				while (newList.hasNext()) 
				{
					if(!itemList.contains(newList))
						itemList.add(newList)
					System.out.println(newList.next());
				}
				
				/*Set<Item> itemSet = new HashSet<Item>(itemList);
				Iterator<Item>newListSet= itemSet.iterator();
				
				System.out.println("\n.....Item list after using HashSet....");
			
				while (newListSet.hasNext()) 
				{
					Item i= newListSet.next();
					System.out.println(i);
		   
				}*/
				
		}
}		