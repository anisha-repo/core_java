 /*sum  of two numbers*/
package com.Anisha;
import java.util.Scanner;
public class Addition
{
  int sum(int a,int b)
  {
   return a+b;
  }
 public static void main(String[] arg)
{
  Scanner read=new Scanner(System.in);
  System.out.println("enter two numbers:-");
  int a,b;
  a=read.nextInt();
  b=read.nextInt();
  Addition s=new Addition();
  System.out.println(s.sum(a,b));
  
}
}
            
