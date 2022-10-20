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
		class StudentCollectionObj
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
		
		System.out.println("\n....addAll method....");
		List<Student>list2=new ArrayList<Student>();
		list2.add(new Student(5,"Ketan",78.0,25));
		list2.add(new Student(6,"Lokesh",81.0,20));
		list2.add(new Student(7,"Mohit",79.0,19));
		System.out.println("\n List2 elements :");
		display(list2);
		
		System.out.println("\n....contains method....");
		boolean b=list1.contains(s1);
		System.out.println("list1 contains s1 : "+b);
		
		Student s2=(new Student(1,"Kirti",80.25,30)); //ref is not so obj is not found
		System.out.println("\n....contains method use equals....");
		boolean b1=list1.contains(s2);
		System.out.println("list1 contains  s2 : "+b1);
		
		System.out.println("\n....Reamove method....");
		list1.remove(s2);
		System.out.println("\nList 1 element After remove: ");
		display(list1);
		
		b=list1.containsAll(list2);
		System.out.println("list1 containsAll list2 : "+b);
		
		Collections.sort(list1);
		System.out.println("Compared and sort based marks");
		//System.our.println("Name: "+name+"Marks: "+marks);		
		display(list1);
		
		StudentAgeComparator sac=new StudentAgeComparator();
		Collections.sort(list1,sac);
		System.out.println("Compared and sort based on Age");
		display(list1);
		
		
	}
}	
		