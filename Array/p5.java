public class P5
{
	public static void main(String[] args) {
	     int arr[]={7,2,3,6,4};
	     int min=arr[0];
	     int max=arr[0];
	   for (int i = 0; i< arr.length-1; i++) { 
            if(arr[i]>max)
            {System.out.println("max---"+max);
                  max = arr[i];
                 
            }
	   }
            for (int i = 0; i< arr.length-1; i++) { 
            if(arr[i] < min)
            {
                  min = arr[i];
                 
            }
                
            }
	   System.out.println("min element is-->"+min+" and max one is -->"+max); 
	
}
}