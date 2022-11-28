class P3
{
    public static void main(String args[])
	{
		
        int[] arr = { 2,6,5,8,8,9,-1 };
        int sum = 6;
        pairsCount(arr, sum);
    }
 
    
    public static void pairsCount(int[] arr, int sum)
    {
 
        int count = 0;
 
       
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
 
        System.out.println("\nCount of pairs is "+ count);
    }
   
    


}