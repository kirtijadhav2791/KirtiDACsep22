/******************************************************************************
 
How to find duplicate elements in a given Array.

*******************************************************************************/
import java.util.*;
public class P18
{
    
    public static void main(String args[])
    {
    
         int arr1[] = {1,2,6,8,7};
         int arr2[] = {5,7,0,10,1};
         
         for(int i=0; i<arr1.length; i++)
          for(int j=0; j<arr1.length; j++)
               if(arr1[i]==arr2[j])
               {
                    System.out.println(arr2[j]+"<-----Duplicate element");
               }
         
         
    }
}
