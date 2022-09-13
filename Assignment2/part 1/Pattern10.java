class Pattern10
{
public static void main(String args[]){
	
int a=65;
for (int i=5; i>=1; i--)
        {
            for (int j=i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=i; j<5; j++)
            {
                //System.out.print(j+ " ");
				System.out.print((char)(a+j)+ " " );
            }
            System.out.println();
        }
	
} 
}
