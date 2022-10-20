import java.io.*;
import java.util.*;
import java.nio.*;
import java.channels.*;

class ByteBufferDemo
{
	public static void main(String args[])
	{
		FileInputStream fis=new FileInputStream("FileRW.txt");
		FileChannel fcin =fis.getChannel();
		ByteBuffer bb=ByteBuffer.alloactae((int)fcin.size());
		fcin.read(bb);
		
		//Reading thr bt buffer and printting it to the concolse
		
		bb.rewind();
		
		fot(int i=0;i<(int)fcin.size();i++)
		{
			System.out.print((char)bb.get(i));
			
		}	
		fin.close();
		System.out.println("File read successfully");
	}
}