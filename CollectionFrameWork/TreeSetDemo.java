import java.util.*;

class Student implements Comparable<Student >
{
	int rollNo;
	String name;
	double marks;
	int age;
	
	Student()
	{
		
	}
    
	Student(int rollNo,String name,double marks,int age)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
	public String toString()
	{
		return "Student[rollNo=  "+rollNo+" , name=  "+name+ " ,Marks= "+marks+" ,Age=  "+age+"]";  
    }
	public int hashCode()
	{
		return (int)(rollNo+ marks+age);
	}
	public boolean equals(Object ob)
	{
		System.out.println("\n equals called :");
		Student s=(Student)ob;
		if(s==null)
			return false;
		
		if(this.rollNo==s.rollNo && this.name.equals(s.name) && this.marks==s.marks)
			return true;
		else
			return false;
	}
	public int compareTo(Student s)
	{
		if(this.marks>s.marks)
			return  1;
	    if(this.marks<s.marks)
			return -1;
		
		  return 0;
		 //return this.name.compareTo(s.name);
	}		
}	

// Comparator interface
class StudentAgeComparator implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		if(s1.age>s2.age)
			return 1;
		if(s1.age<s2.age)
			return -1;
		return 0;
	}
}
class TreeSetDemo
{
		public static void main(String args[])
		{
			Map<Integer,Student>map1=new HashMap<Integer,Student>();
			Student s1=new Student(1,"Kirti",65.0,30);
			Student s2=new Student(1,"Pooja",56.0,29);
			
			System.out.println("\n....add element using put method....");
			map1.put(1,s1);
			map1.put(2,s2);
			
			Student s3=new Student(3,"Shruti",68.0,26);
			Student s4=new Student(4,"Avni",69.0,25);
			map1.put(1,s3);
			map1.put(2,s4);
			
			System.out.println("\n...Retrive element using get method....");
			Student s=map1.get(1,s3);
			System.out.println(s);
			System.out.println("Iterating map using entryset()...");
			
			System.out.println("Map1 Elements ");
			for(Map.Entry<Integer,Student>entry:set1)
			{
				System.out.println(entry);
			}	
			
			System.out.println("Map1 elements(only keys value): ");
			for(Map.Entry<Integer,Student>entry:set1)
			{
				System.out.println(entry.get());
			}
	  }
}	
		