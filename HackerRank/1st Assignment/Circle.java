import java.util.*;
	class Circle
	{
		
		Scanner sc= new Scanner(System.in);
		int r =sc.nextInt();
		float pi=3.14f,area,circum;
		
		void areaOfCircle()
		{
          area=pi*r*r;
		  System.out.println("Area of circle is:"+area);
		}
        void circumferenceOfCircle()
        {
		  circum=2*pi*r;
		  System.out.println("Circumference Of Circle is:"+circum);
		}
	 public static void main(String args[])
	 {
		 System.out.println("Enter value for redies:");
		 
		 Circle c=new Circle();
		 c.areaOfCircle();
		 c.circumferenceOfCircle();
		 
	 }
	}
			