//Java Program to Illustrates Use of Abstract Class and Method

import java .util.*;
 abstract class AbstractDemo
{

    double a,b,c;
    abstract void add(double a,double b);
    void subtract(double a,double b)
    {
        c=a-b;
        System.out.println("Substraction Result:"+c);
    }
    abstract void multiply(double a,double b);
    void divide(double a,double b)
    {
        c = a / b;
        System.out.println("Division Result:"+c);
    }
}
class ArithmaticCalculation extends AbstractDemo
{
    void add(double a,double b)
    {
        c = a + b;
        System.out.println(" Addition Result:"+c);
    }
    void multiply(double a,double b)
    {
        c = a * b;
        System.out.println(" Multiplication Result:"+c);
    }

    public static void main(String[] args)
    {
        ArithmaticCalculation obj = new ArithmaticCalculation();
		Scanner sc=new Scanner (System.in);
		System .out.println("Enter numbers for arithmatic opration:");
	     double a=sc.nextInt();
		double b=sc.nextInt();
		
        obj.add(a,b);
        obj.subtract(a,b);
        obj.multiply(a,b);
        obj.divide(a,b);
    }
}