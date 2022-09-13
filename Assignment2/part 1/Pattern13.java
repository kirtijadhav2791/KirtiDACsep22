class Pattern13
{
public static void main(String args[]){
	
int a=65;
for (int i=0; i<5; i++)
        {
            for (int j=5; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++)
            {
                //System.out.print(j+ " ");
				System.out.print((char)(a+i)+ " " );
            }
            System.out.println();
        }
	
} 
}
