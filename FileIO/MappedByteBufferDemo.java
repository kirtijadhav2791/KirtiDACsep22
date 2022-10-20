mport java.io.*;
import java.util.*;
import java.nio.*;
import java.channels.*;

class MappedByteBufferDemo
{
	public static void main(String args[])
	{
		FileInputStream fis=new FileInputStream("FileRW.txt");
		FileChannel fcin =fis.getChannel();
		
		MappedByteBuffer bb=fcin.map(FileChannel.MapMode.READ_ONLY,0,fcin.size());
		//fcin.read(bb);
		
		//Reading thr bt buffer and printting it to the concolse
		
		bb.rewind();
		
		fot(int i=0;i<(int)fcin.size();i++)
		{
			System.out.print((char)bb.get(i));
			
		}	
		
		System.out.println("File read successfully");
		
		bb.rewind();
		FileOutputStream fos=new FileOutputStream 
	}
}