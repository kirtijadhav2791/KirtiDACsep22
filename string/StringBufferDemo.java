class StringBufferDemo
{
	public static void main(String args[])
		{
		   StringBuffer sb= new StringBuffer("Welcome ");
		   System.out.println(sb);
		   sb.append(" Friends");
		   System.out.println(sb);
		   
		   StringBuffer sb2= new StringBuffer();
		   
		    System.out.println("Display Capacity of string buffer:"+sb2.capacity());
			
			StringBuffer sb3= new StringBuffer("1234");
		   
		    System.out.println("Display Capacity of string buffer:"+sb3.capacity());
			
			sb3.append("123456789012");
			 System.out.println("Display Capacity of string buffer:"+sb3.capacity());
			
		}
}		