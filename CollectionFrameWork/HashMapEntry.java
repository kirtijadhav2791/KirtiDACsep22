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
	public void printNameAndMarks()
	{
		System.out.println("Name = "+name +" Marks = "+marks);
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

class HashMapEntry
{
		public static void main(String args[])
		{
			Map<Integer,Student>map1=new HashMap<Integer,Student>();
			Student s1=new Student(1,"Kirti",65.0,30);
			Student s2=new Student(1,"Pooja",56.0,29);
			
			System.out.println("\n....add element using put method....");
			map1.put(1,s1);
			map1.put(2,s2);
			
			map1.put(3,new Student(3,"Shruti",68.0,26));
			map1.put(4,new Student(4,"Avni",69.0,25));
			System.out.println(map1s);
			
			System.out.println("\n...Retrive element using get method....");
			Student s=map1.get(3);
			System.out.println(s);
			
			System.out.println("\nIterating map using entryset()...");
			Set<Map.Entry<Integer,Student>>set1=map1.entrySet();
			
			System.out.println("Map1 Elements ");
			for(Map.Entry<Integer,Student>entry:set1)
			{
				System.out.println(entry);
			}	
			
			 System.out.println("\nMap1 elements(only value): ");
			 System.out.println("\n...  getValue method....");
			for(Map.Entry<Integer,Student>entry:set1)
			{
				System.out.println(entry.getValue());
			}
			 
			System.out.println("\nMap1 elements(only keys value): ");
			System.out.println("\n...  getKeymethod....");
			for(Map.Entry<Integer,Student>entry:set1)
			{
				System.out.println(entry.getKey());
			}
			
			System.out.println("Map1 keys retrived through Keyset() value method");
			Set<Integer>kset=map1.keySet();
			for(Integer k:kset)
			{
				System.out.println(k);
			}
				
			System.out.println("\n... value method....");
			Collection<Student>elements=map1.values();
			System.out.println("Map1 elements retrived through values() method:");
			for(Student st:elements)
			{
				System.out.println(st);
			}	
	  }
	  
}	
		