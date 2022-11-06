class PermutationCominationRecur
{
	 static void permutation(String s,String res )
	{
		if(s.length()==0) 
		{			//empty 
			System.out.println(res);
			return;
		}
			
			for(int i=0;i<s.length();i++)
			{
				char temp=s.charAt(i);
				System.out.println("1st temp.."+temp+"..");
			    String temp1=s.substring(0,i)+s.substring(i+1);
				System.out.println("2nd temp1.."+temp1+"..");
				 permutation(temp1,res+temp);
			}		
	}
	public static void main(String args[])
	{
		String str="ABC";
		permutation(str," ");
	}
}	