import java.util.*;
class Student 
{
	Scanner sc=new Scanner(System.in);
	
	String name[]=new String[3];
	String subName[]=new String[3];
	int marks[]=new int[3];
	int count=0;
	Student()
	{
	
	}
	/*Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}*/	
	public void getStudData()
	{
		
		for(int i=0;i<3;i++)
		{
			System.out.println("\nEnter Student name:");
		    name[i]=sc.next();
		for(int j=0;j<3;j++)
		{
			System.out.println("Enter SubName and Marks for " +(j+1)+ "  subject:");
			subName[j]=sc.next();
			marks[j]=sc.nextInt();
		
		}
		
		for(int k=0;k<3;k++)
		{
			System.out.println("Subject Name:= "+subName[k]+":="+marks[k]);
		}
			int total=marks[0]+marks[1]+marks[2];
		System.out.println("\nStudent name:= "+name[i]+ "  Student Total Marks := "+total);
		double avg=total/3;
		System.out.println("Student name:= "+name[i]+ "  Student Avg Marks := "+avg);
	}	
	}
		
	/*public	void marksTotal()
		{
			
			int total;
				total=marks[0]+marks[1]+marks[2];	
		}*/	
}	

class StudentMarks
{
		public static void main(String args[])
		{
			Student s=new Student();
			s.getStudData();
			//s.marksTotal();
		}
}		