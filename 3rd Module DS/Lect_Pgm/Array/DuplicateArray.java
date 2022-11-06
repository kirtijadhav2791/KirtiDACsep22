class DuplicateArray
{
	//static int arr[];
    static void  compare(int a[])
	{
		
		for(int i =0; i<a.length; i++)
          {    
               for(int j=i+1; j<a.length; j++) 
                  if(a[i] == a[j])
					System.out.println(a[j]);	 
				//else return -1; 
          }
		  
		 //return 1;  
	}
          
     public static void main(String args[])   
     {  
          int arr[] = {4,5,3,2,4,2,5};
         
		 compare(arr);
     //System.out.println(compare(arr));
           
     }
}