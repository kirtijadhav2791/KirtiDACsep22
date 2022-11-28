//8. Java Program to Count Number of Objects Created for Class
import java.util.*;

class ObjectDemo
{
	
	static int count;
	
	ObjectDemo()
	{
		
		count++;
	
	}
	
	static void printCount()
	{
		
		System.out.println("Number of objects are created : "+count);
	
	}
	
}

class ObjectCountDemo{
	
	public static void main(String args[]){
		
		ObjectDemo s1 = new ObjectDemo();
		ObjectDemo s2 = new ObjectDemo();
		ObjectDemo s3 = new ObjectDemo();
		ObjectDemo.printCount();
	}
}