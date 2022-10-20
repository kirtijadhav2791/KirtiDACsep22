import java.util.*;
 class VotingAgeCond1 extends Exception
{
     public VotingAgeCond1(String msg)
     {
          super(msg);
     }
}
class VotingAgeCond2 extends Exception
{
     public VotingAgeCond2(String msg)
     {
          super(msg);
     }
}
public class OwnException
{
	 
	Scanner sc=new Scanner(System.in);
	static int age;
      public static void main(String args[]) throws Exception
      {
           OwnException oe = new OwnException();
		   System.out.println("Enter your Age:");
			//age=sc.nextInt();
			
			 try
		  {  
           if(age>20)
			    throw new VotingAgeCond1("You r eligiable for voting");
			//display();
		  }
			catch(VotingAgeCond2 v)
			{
				 System.out.println(v.getMessage());
			}
      }
      static void getAge()throws VotingAgeCond1
	  {
		  age=sc.nextInt();
		 
	  }
	 
}