import java.util.*;
import java.io.*;
class ByteStreamRW
{
//D:\\2nd  java module\\oop lect\\FileIO
		public static void main(String args[])throws IOException
		{
			File fin=new File("D:\\2nd  java module\\oop lect\\FileIO\\FileRW.txt");
			File fout = new File("D:\\2nd  java module\\oop lect\\FileIO\\target.txt");
			if(!fin.exists())
			{
				System.out.println("File does not exists");
				return;
			}
			FileInputStream fis =new FileInputStream(fin);
			FileOutputStream fos=new FileOutputStream(fout);
			
			BufferedInputStream bis=new BufferedInputStream(fis);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			int ch;
			while((ch=bis.read())!=-1)
			{
				System.out.print((char)ch); //no typecast then it shows the asccii value
				bos.write(ch);
			}
			fis.close();
			bos.flush();
			fos.close();
			System.out.println("\n File copied successfully to target.txt");
		}
}		