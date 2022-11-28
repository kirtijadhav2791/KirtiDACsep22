/*How to convert a byte array to String?*/


import java.util.*;
public class P11
{
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	System.out.println("Enter byte value to be converted ");
	byte n = sc.nextByte();
	  
	byte a1[] = new byte[n];

	for(int i = 0; i< n; i++)
	  {   a1[i]=sc.nextByte();
	  }
	String str = new String(a1);
	
	System.out.println(str);
	//------------------------------------------------------
     byte[] byteArray = { 'K', 'A', 'M', 'E', 'S', 'H' };
		byte[] byteArray1 = { 77, 97, 104, 97, 106, 97, 110 };

		String str1 = new String(byteArray);
		String str2 = new String(byteArray1);

		System.out.println(str1);
		System.out.println(str2);
	}
}

