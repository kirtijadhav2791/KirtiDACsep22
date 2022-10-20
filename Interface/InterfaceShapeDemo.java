import java.util.*;
interface Shape
{
   public void area();
}
class Circle implements Shape
{
	int r=5;
	double pi=3.14,area;
	   public void area()
	   { 
		 area=pi*r*r;
		 System.out.println("Area of circle is:"+area);
		}
}
class Rectangle extends Circle
{
	
  int len=10,bre=12;
  double area;
     public void area()
	 {
		 super.area();
	   area=len*bre;
	   System.out.println("Area of Rectangle is:"+area);
	  }
}
class Square extends  Rectangle
{       
		int side=14;
		double area;
		public void area()
		{
			super.area();
			area=side*side;
			System.out.println("Area of square is:"+area);
		}	
}
class InterfaceShapeDemo
{
		public static void main(String args[])
		{
			Square sq=new Square();
			sq.area();
		}
}		
		
  