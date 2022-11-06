import java.util.*;
class RemoveSpecialchar
{
		public static void main(String args[])
		{
				String str;  
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enterany string including special char: ");
				str=sc.nextLine();
			     str = str.replaceAll("[^a-zA-Z]", " "); 
				System.out.println("After remove special char :"+str);
				
		}
	}	
				