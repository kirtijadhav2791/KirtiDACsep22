public class P7
{
	public static void main(String[] args) {
		int arr1[]={23,60,94,3,102};
		int arr2[]={42,16,74};
	     
	    // arr[] = arr1[]+arr2[];  not work
	    
	    int a = arr1.length;
	    int b =arr2.length;
	    int c =a+b;
	    int arr3[] = new int[c];
	    
	    for(int i=0; i<a; i++)
	    arr3[i] = arr1[i];
	   
	   
	    for(int i=0; i<b; i++)
	    arr3[a+i] = arr2[i];
	    
	    
	    for(int i=0; i<c; i++)
	    System.out.print(arr3[i]+", ");
	     }
}
