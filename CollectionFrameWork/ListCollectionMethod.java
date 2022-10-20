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
class ListCollectionMethod
{
		public static void display(List<Student> mylist)
		{
		   Iterator<Student>it=mylist.iterator();
		   while(it.hasNext())
		   {
			   Student s= it.next();
			   System.out.println(s);
		   }
		} 
	   
		public static void main(String args[])
	   {
		List<Student>list1=new ArrayList<Student>();
		
		Student s1=(new Student(1,"Kirti",79.0,30));
		list1.add(s1);
		list1.add(new Student(2,"Kamesh",82.0,25));  //ref ..is not store in any variable 
		list1.add(new Student(3,"Kamlesh",76.0,22));
		list1.add(new Student(4,"Kaustubh",78.0,21));
		
		System.out.println("Iterator use: ");
		Iterator<Student>it=list1.iterator();
		while(it.hasNext())
		{
			Student s= it.next();
			System.out.println(s);
		}	
		
		List<Student>list2=new ArrayList<Student>();
		
		list2.add(new Student(5,"Ketan",79.0,25));  //ref ..is not store in any variable 
		list2.add(new Student(6,"Lokeshsh",84.0,22));
		list2.add(new Student(7,"Mohit",79.25,21));
		
		System.out.println("\n....Index method....");
		Student s=list1.get(2);
		System.out.println("Element at Index 2 :");
		System.out.println(s);
		
		System.out.println("\n....add method....");
		list1.add(2,new Student(8,"Manish",76.0,19));
		System.out.println("List after Adding Manish:");
		display(list1);
		
		System.out.println("\n....indexOf method....");
		int j=list1.indexOf(new Student(7,"Mohit",79.25,21));
		System.out.println("Index of Mohit in list1: "+j);
		display(list1);
		
		
		System.out.println("\n....addAll method....");
		list1.addAll(3,list2);
		System.out.println("List1 after adding list2 at index 3");
		display(list1);
		
		System.out.println("\n....indexOf method....");
		int i=list1.indexOf(new Student(1,"Kirti",79.0,30));
		System.out.println("Index of Kirti in list1: "+i);
		display(list1);
		
		
		
		
	}
}	
		