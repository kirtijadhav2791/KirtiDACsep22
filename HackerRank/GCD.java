import java.io.*;
import java.util.*;

public class GCD{

    public static void main(String[] args) {
        int num1,num2,gcd=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number to find GCD 54");    
        num1=sc.nextInt();
        System.out.println("Please enter second number to find GCD 24");
        num2=sc.nextInt();
        
        for(int i=1;i<=num1 && i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd=i;
                
        }
        System.out.println("GCD of two numbers "+num1+" and "+num2+" is :"+gcd);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}