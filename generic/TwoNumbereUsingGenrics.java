class TwoNumber<T extends Number>
{
	T a;
	T b;
	
		TwoNumbers(T a,T b)
		{
			this.a=a;
			this.b=b;
		}
		
		double sum()
		{
			double res=a.doubleValue()
			+b.doublevalue();
		return res;
		}
}

Class TwoNumbereUsingGenrics
{
			punlic static void main(String args[])
			{
				TwoMumber<Integer>tn1=new TwoNumber<Integer>(5,10);
				double res=tn1.sum()
				System.out.println(res);
				TwoMumber<Double>tn2=new TwoNumber<Integer>(15.5,10.5);
				 res=tn2.sum;
				system.out.println(res);
			}
}			