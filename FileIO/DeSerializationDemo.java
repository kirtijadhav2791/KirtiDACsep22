import java.io.*;
import java.util.*;

class Demo
{
	int a;
	String s;
	double d;
	
	Demo()
	{
	}
	
	Demo(int a ,String s,double d)
	{
	   this.a=a;
	   this.s=s;
	   this.d=d;
	 }
	 public String toString()
	 {
	 return "Demo[a= "+a+" ' s= "+s+" , d= "+d+ "]";
	 }
}

class DeSerializationDemo
{
	public static void main(String args[])
	{
		
		FileInputStream fis=new FileInputStream("myobjects.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Demo d=ois.readObject();
		

		ois.close();
		System.out.println("Object of class Demo Deserialized from  2ndary storage successufully");
		System.out.println("Object state :"+d);
		
	}
}	
		