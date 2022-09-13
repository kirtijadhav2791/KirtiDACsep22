class Pattern6
{
  public static void main(String args[])
  {

     for (int i=9; i>=1; i--)
        {
            for (int j=5; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
  }
}