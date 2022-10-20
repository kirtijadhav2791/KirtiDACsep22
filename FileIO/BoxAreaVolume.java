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
	}
	void getArea()
	{
		double area;
		area=width*breadth;
	}	
		