import java.util.*;
import java.io.*;

class Student
{
		int rollNo;
		String name;
		double marks;
		
		Student()
		{
		}
		Student(int rollNo,String name,double marks)
		{
				this.rollNo=rollNo;
				this.name=name;
				this.marks=marks;
		}
			public String toString()
			{
				return "Student[rollNo=  "+rollNo+" , name=  "+name+ " ,Marks= "+marks+"]";  
			
			}
}
class FileRWBuffRW
{
//D:\\2nd  java module\\oop lect\\FileIO
		public static void main(String args[])throws IOException
		{
			File fin=new File("D:\\2nd  java module\\oop lect\\FileIO\\FileRW.txt");
			File fout = new File("D:\\2nd  java module\\oop lect\\FileIO\\target.txt");
			if(!fin.exists())
			{
				System.out.println("File does not exists");
				return;
			}
			FileReader fr =new FileReader(fin);
			FileWriter fw=new FileWriter(fout);
			
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter bw=new BufferedWriter(fw);
			
			//List to store student object
			//List<Student>studList=new ArrayList<>();
			List<Student>studList=new LinkedList<>();
			
			String line;
	
			while((line=br.readLine())!=null)
			{
				line=line.trim();
				String str[]=line.split(",");
				
				int rollNo=Integer.parseInt(str[0]);
				String name=str[1];
				double marks =Double.parseDouble(str[2]);
				
				//create student objet
				Student s=new Student(rollNo,name,marks);
				studList.add(s);
				
				
			}
			br.close();
			
				System.out.println("\nList created successfully:");
					System.out.println("List elements:");
					FileWriter fw=new FileWriter("student_details_out.txt");
					BufferedWriter bw=new BufferedWriter(fw);
					
					for(Student s:studList)
					{
						s.marks=s.marks+5;
						bw.write(s.toString()+"\n");
					}
				bw.flush();
				bw.close();	
		}
}		