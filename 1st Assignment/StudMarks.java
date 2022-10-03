import java.util.*;
	class StudMarks
	{
		public static void main(String args[])
		{    
		    int total=0,i,n;
			float result;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter numer of subject:");
			n=sc.nextInt();
			int sub[]=new int[n];
			
			for(i=0;i<n;i++)
			{
				int j=i+1;
			    System.out.println("Enter marks for subject"+j+" out of 100:");
				sub[i]=sc.nextInt();
				//j++;
				total= total+sub[i];
			}
			
              		result= (total/n*100)*100;
            System.out.println("Percentage Marks =" +result+"%");
		}
	}		
                 				
				
			