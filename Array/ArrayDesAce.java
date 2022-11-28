import java.util.*;
public class ArrayDesAce
{
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	System.out.println("enter your no of ele in array");
	int n = sc.nextInt();
	  
	int a1[] = new int[n];

	for(int i = 0; i< n; i++)
	  {   a1[i]=sc.nextInt();
	  }

     int countA=0;
     int countD=0;
	for(int i = 0; i< a1.length-1; i++)
	{
     	if(a1[i] < a1[i+1] )
          {
               if(a1[i+1] > a1[i+2])
               {
                    System.out.println("Random");
                    break;
               }
               countA++;
              // continue;
          }
     	else if(a1[i] > a1[i+1] )
          {	
               if(a1[i+1] < a1[i+2])
               {   
                    System.out.println("Random");
                    break;
               }
               countD++;
               //continue;
          }
     
	}
	
	if(countD > countA)
	{
	     System.out.println("Descending");
	}
	else if(countD < countA)
	{
	      System.out.println("Ascending");
	}
	}
}