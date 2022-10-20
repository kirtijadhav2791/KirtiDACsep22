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
	int age;
	Scanner sc=new Scanner(System.in);
	
      public static void main(String args[]) throws Exception
      {
           OwnException oe = new OwnException();
		   System.out.println("Enter your Age:");
			age=sc.nextInt();
			 try
		  {  
           if(age>20)
			 oe.display();
		  }
			catch(VotingAgeCond2 v)
			{
				oe.display1();
			}
      }
      public void display() throws OwnException
      {
		 throw new VotingAgeCond1("You r eligiable for voting");
		 System.out.println(getMessage());
	  }
	  public void display1() throws OwnException
	  {
		   System.out.println(v.getMessage());
		  throw new VotingAgeCond2("You r not eligiable for voting");
      }
}