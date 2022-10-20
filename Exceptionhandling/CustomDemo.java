import java.util.*;
 class VotingAgeCond1 extends Exception
{
     public CustomException(String msg)
     {
          super(msg);
     }
}
class VotingAgeCond2 extends Exception
{
     public CustomException(String msg)
     {
          super(msg);
     }
}
public class OwnEcxption
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
			catch
			{
				oe.display1();
			}
      }
      public void display() throws OwnException
      {
		 throw new VotingAgeCond1("You r eligiable for voting");
	  }
	  public void display1() throws OwnException
	  {
		  throw new VotingAgeCond2("You r not eligiable for voting");
      }
}