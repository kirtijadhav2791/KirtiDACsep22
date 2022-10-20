
class StringHandling
{
		public static void main(String args[])
		{
			String s1="welcome";
			String s2=new String("welcome");
			String s3="welcome";
			String s4=new String("welcome");
			
			System.out.println("s1== s2 returns "+(s1==s2)); //false
			System.out.println("s1== s3 returns "+(s1==s3));  //true
			System.out.println("s3== s4 returns "+(s3==s4));  //false
			
						
			System.out.println("s1.equals(s2) returns "+s1.equals(s2)); //true
			System.out.println("s1.equals(s3) returns "+s1.equals(s3));  //true
			System.out.println("s3.equals(s4) returns "+s3.equals(s4));  //true
			
			char ch=s1.charAt(0);
			System.out.println("Return character of that Index:  "+ch);
			
			char ch1[]=new char[10];
			
			s1.getChars(2,5,ch1,0);
			
			for(int i=0;i<ch1.length;i++)
			{
				System.out.println(ch1[i]);
			}
           System.out.println();	
		   
		   System.out.println("Output of getByte");
		   byte [] b=s1.getBytes();
		   for(byte x:b)
		   {
			   System.out.println(x);
		   }
		   
		   System.out.println("Output of .equals:");
		   String s5="WElcome";
		   String s6="welcome";
		   System.out.println("s5.equals(s6) is: "+s5.equals(s6));
		    System.out.println("\nOutput of .equalssIgnoreCase:");
		   System.out.println("s5.equalsIgnoreCase(s6) is: "+s5.equalsIgnoreCase(s6));
		   
		   System.out.println("\nOutput of toCharArray:");
		   
		   char charr[]=s1.toCharArray();
		   for(int i=0;i<charr.length;i++)
		   {   
				System.out.println(charr[i]);
		   }

			 System.out.println("\nOutput of compareTo:");
			   String s7="ABACDD";
			   String s8="ABAACC";
			   
			   System.out.println("s7.compareTo(s8) return :"+s7.compareTo(s8));
		   
		   System.out.println("\nOutput of SubString:");
		   
		   String s9=s1.substring(3);
		   System.out.println(s9);
		   
		   String s10=s1.substring(3,5);
		   System.out.println(s10);
		   
		   System.out.println("\nOutput of IndexOf:");
		   System.out.println(s1.indexOf("com"));
			System.out.println(s1.indexOf("cme"));
			
			 System.out.println("\nOutput of isEmpty:");
			String s11="   ";
			 System.out.println(s11.isEmpty());
			 
			 System.out.println(

		}
}		