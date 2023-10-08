//subpackage

package com.ani.guest.greeting;
import com.ani.guest.questions.*;
import java.util.Scanner;
public class Greeting
{
 public static void main(String[] arg)
 {
 System.out.println("Namaste");
 Ques q = new Ques();
 q.question();
 Scanner in = new Scanner(System.in);
 String s = in.nextLine();
 }
}
