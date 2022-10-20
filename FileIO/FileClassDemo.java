import java.util.*;
import java.io.File;
class FileClassDemo
{
		public static void main(String args[])
		{
			File f=new File("D:\\2nd  java module\\oop lect");
			
			if(f.exists())
			{
			  System.out.println("Exists");
			}
			else
			{
				 System.out.println("Does not Exists");
			}	 
			if(f.isDirectory())
			{
				System.out.println("It is a directory");
				String filenames[]=f.list();
				System.out.println(Arrays.toString(filenames));
				
				System.out.println("....listFile method......");
				File fileobj[]=f.listFiles();
				for(File fl:fileobj)
				{
					if(fl.isDirectory())
					{
						System.out.println(fl.getName()+"is a directory");
					}
					else
					{
						System.out.println(fl.getName()+" is a file");
					}	
				}	
						
			}
			if(f.isFile())
			{
				System.out.println("It is a file");
			}
			
		}
}		