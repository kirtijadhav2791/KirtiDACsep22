import java.util.Arrays;

class P2
{
    public static void main(String args[])
	{
		int a[] = new int[]{1,2,5};
        int b[] = new int[]{1,2,3};
        int c[] = new int[]{1,2,3};
            if(a == b)
            System.out.println("both arrays are same");
            else
            System.out.println("Arrays are diff");
       
            System.out.println(Arrays.equals(a, b));
            System.out.println(Arrays.equals(c, b));
	}
	

}