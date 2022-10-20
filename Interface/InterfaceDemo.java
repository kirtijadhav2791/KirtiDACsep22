interface MyInterface
{
		public static final int a=1;
		public static final int b=3;
		
		public abstract void fun1();
		public abstract void fun2();
}		
interface DBDriver
{
		int MX_CONNECTION=500;
		void createConnection();
		void getConnection();
		void closeConnection();
}

class OracalDBDriver implements DBDriver
{
		public void createConnection()
		{
				System.out.println("create connection of oracle");
				System.out.println("Max connection aalowed :=:" +DBDriver.MX_CONNECTION);
				System.out.println("Max connection aalowed :=:" +MX_CONNECTION);
		
		}
		
		public void getConnection()
		{
			System.out.println("Get connection of oracle");
		}

		public void closeConnection()
		{
		   System.out.println("close connection of oracle");
		}
}

class InterfaceDemo
{
		public static void main(String args[])
		{
				OracalDBDriver orac=new OracalDBDriver();
				orac.createConnection();
				orac.closeConnection();
				
				
				DBDriver dbDriver;
				dbDriver=new OracalDBDriver();
				dbDriver.createConnection();
				dbDriver.closeConnection();
		}
}		