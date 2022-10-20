class MyNonGen 
{
    private Object val;

    void setVal(Object val)
    {
        this.val = val;

    }
    Object getVal()
    {

        return val;
    }
}

	class MyNonGenericsDemo
	{
		public static void main(String[] args) 
		{
			MyNonGen mg1=new MyNonGen();
			mg1.setVal(5);                 //Object data = new Integer(5)
			Integer a = (Integer)(mg1.getVal()); 
			System.out.println(a);
			//error =Object cannot be converted to Integer=>Integer=object
			
			MyNonGen mg2=new MyNonGen();
			mg1.setVal("Welcome");			//Object data = "Welcome"
			String s = (String)(mg2.getVal());
			System.out.println(a);
			//error =Object cannot be converted to String
			
        }
    }
