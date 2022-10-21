

import java.io.*;
import java.util.*;

public class CountStringDuplicate {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str,str1,str2;
        //int count=0;
        
        str="Programming"; 
        str1="Combination";
        str2="Java";
        
        char s[]=str.toCharArray();
        char s1[]=str1.toCharArray();
        char s2[]=str2.toCharArray();
        
     System.out.println("List of duplicate characters in String 'Programming' " );
        
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
				int count=1;
            if(s[i]==s[j])
            {
                   count ++;          
                System.out.println(s[j]+":"+count); 
                
            }
          }
        }
      System.out.println("List of duplicate characters in String 'Combination'" );
             for(int i=0;i<str1.length();i++)
        {
          for(int j=i+1;j<str.length();j++)
          {
			  int count=1;
            if(s1[i]==s1[j])
            {
                count ++;
                System.out.println(s1[j]+":"+count);                
            }
          }
        }
      System.out.println("List of duplicate characters in String 'Java' ");
             for(int i=0;i<str2.length();i++)
        {
           for(int j=i+1;j<str2.length();j++)
           {
			   int count=1;
            if(s2[i]==s2[j])
            {
                count ++;
                System.out.println(s2[j]+":"+count);                
            }
           }     
        
        
             }
       
        
       
    }
}