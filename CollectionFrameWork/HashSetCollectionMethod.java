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
class HashSetCollectionMethod
{
		public static void display(Set<Student> mySet)
		{
		   Iterator<Student>it=mySet.iterator();
		   while(it.hasNext())
		   {
			   Student s= it.next();
			   System.out.println(s);
		   }
		} 
	   
		public static void main(String args[])
	   {
		Set<Student>set1=new HashSet<Student>();
		
		Student s1=(new Student(1,"Kirti",79.0,30));
		set1.add(s1);
		set1.add(new Student(2,"Kamesh",82.0,25));  //ref ..is not store in any variable 
		set1.add(new Student(3,"Kamlesh",76.0,22));
		set1.add(new Student(4,"Kaustubh",78.0,21));
		
		System.out.println("\n-:set1 element:- ");
		Iterator<Student>it=set1.iterator();
		while(it.hasNext())
		{
			Student s= it.next();
			System.out.println(s);
		}	
		
		Set<Student>set2=new HashSet<Student>();
		
		set2.add(new Student(5,"Ketan",79.0,25));  //ref ..is not store in any variable 
		set2.add(new Student(6,"Lokeshsh",84.0,22));
		set2.add(new Student(7,"Mohit",79.25,21));
		
		System.out.println("\n-:set2 element:-");
		display(set2);
		
		System.out.println("\n....after adding same element.");
		set1.add(new Student(1,"Kirti",79.0,30)); 
		display(set1);
		System.out.println("\n....after adding same element.");
		set1.add(new Student(2,"Kamesh",82.0,25)); 
		display(set1);
		
		
		
	}
}	
		