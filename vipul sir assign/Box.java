class Box
{
	int height,width,breadth;
	Box()
	{
		height=0;
		width=0;
		breadth=0;
	}
	
	Box(int height,int width,int breadth)
	{
		this.height=height;
		this.width=width;
		this.breadth=breadth;
	}	
	
	void getVolume()
	{
		double volume;
		volume=height*width*breadth;
		System.out.println("Volume of Box is : "+volume);
		System.out.println(" ");
	}
	void getArea()
	{
		double area;
		area=width*breadth;
		System.out.println("Area of Box is: "+area);
	}	
		public static void main(String args[])
		{
			Box b=new Box(3,7,8);
			Box b1=new Box(8,10,12);
			
			b.getArea();
			b.getVolume();
			
			b1.getArea();
			b1.getVolume();
		}
}		
			