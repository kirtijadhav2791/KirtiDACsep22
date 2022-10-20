class MyGen<T>      //<T extends Object>
{
		int Data;
		
		void setData(T Data)
		{
			this.Data=Data;
		}
		
		T getData()
		{
			return Data;
		}
}

class First
{
		int a;
		int b;
		First(int a,int b)
		{
			this.a=a;
			this.b=b;
		}
		
		public 
	

class MyGenDemo
{
		public static void main(String args[])
		{
			MyGen mg1=new MyGen();
			mg1.setData(5);
			int a=mg1.getData();
			System.out.println(a);
			
			MyGen mg2=new MyGen();
			mg2.setData(5);
			int a=mg1.getData();
			System.out.println(a);