public class P6
{
	public static void main(String[] args) {
	     int arr[]={24,54,31,16,82,45,67};
	     int min=arr[0];
	     int max=arr[0];
	    int count=0;
	   for (int i = 0; i< arr.length-1; i++) { 
            if(arr[i]>max && count <4)
            {
                  max = arr[i];
                  count++;
            }
	   }
           
	   System.out.println("Third max element is-->"+max); 
	
}
}