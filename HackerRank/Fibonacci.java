import java.io.*;
import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        int num1=0,num2=1,num=0,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number upto which Fibonacci series to print: 12");
        count=sc.nextInt();
       //  System.out.println(num2+" "); 
        System.out.print("Fibonacci series upto 12 numbers :  \n"+num2);

        for(int i=1;i<count;i++)
        {
            num=num1+num2;
             System.out.print(" "+num);
            num1=num2;
            num2=num;
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}