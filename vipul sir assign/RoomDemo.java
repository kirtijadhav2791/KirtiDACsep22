class Room
{
	int height,width,breadth;
	int roomVolume;
	Room()
	{
	}
	 Room(int height,int width,int breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}
	
	long volume()
	{
		roomVolume=height*width*breadth;
		return roomVolume;
	}
}

class RoomDemo //extends Room
{
		public static void main(String args[])
		{
			Room r= new Room(5,5,9);
			r.volume();
			System.out.println("Volume of room: "+r.volume());
		}
}		
		