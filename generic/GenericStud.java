class Student
{
	int rollNo;
	double marks;
	
	
	Student(int rollNo,double marks)
	{
	  this.rollNo=rollNo;
	  this.marks=marks;
	}
	public String toString()
	{
		return ""+rollNo+", "+marks;
	}

}
class MyGen<T1,T2>

{
	T1 ob1;
	T2 ob2;
	
	
	void setOb1(T1 ob1)
	{
		this.ob1=ob1;
	}
	
	T1 getOb1()
	{
		return ob1;
	}
	
	void setOb2(T2 ob2)
	{
		//this.ob1=ob1;
		this.ob2=ob2;
	}
	
	T2 getOb2()
	{
		return ob2;
	}
	
	
}

 class GenericStud
{
	public static void main(String[] args) {

		MyGen<Integer,Double> mg1 = new MyGen<Integer,Double>();
		mg1.setOb1(10);
		mg1.setOb2(65.23);
		
		int i = mg1.getOb1();
		double d = mg1.getOb2();
		System.out.println(i);
		System.out.println(d);

        MyGen<Integer,Student>mg2 =new MyGen<Integer,Student>();
		mg2.setOb1(03);
		mg2.setOb2(new Student(2,87.5));
		
		System.out.println(mg2.getOb1());
		System.out.println(mg2.getOb2());
	}
}
