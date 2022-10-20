class WrapperDemo
{
		public static void main(String args[])
		{
			Double d1= new Double(53.5);
			Double d2= new Double("53.5");
			Double d3=Double.valueOf("53.5");
			Double d4=Double.parseDouble("53.5");
			System.out.println(d1);
			System.out.println(d2);
			System.out.println("valueOf method: "+d3);
			System.out.println("parseDouble: "+d4);
			//System.out.println(d);
			
			Double dobj1= new Double("258.5");
			
			int res=d1.compareTo(dobj1);
			System.out.println("d1.compareTo(dobj1): "+res);
			
			
			String s=d3.toString();
			System.out.println("d3.toString:"+s);
			int ip=Integer.parseInt("123"); //String to int primitive
			System.out.println(ip);
			
			Double dp=dobj1.doubleValue();
			byte bp=dobj1.byteValue(); 			//bp will value 2
			int ip1=dobj1.intValue();
			System.out.println("Byte value: "+bp);
			System.out.println("Int value: "+ip);
			
			Boolean boolp=Boolean.parseBoolean("true");
			boolp.toString();
			
			int num=31;
			String binres=Integer.toBinaryString(num);
			String octalRes=Integer.toOctalString(num);
			String hexRes=Integer.toHexString(num);
			System.out.println("Binary of num :"+binres);
			System.out.println("octal of num :"+octalRes);
			System.out.println("Hexa of num :"+hexRes);
		}
}		
			