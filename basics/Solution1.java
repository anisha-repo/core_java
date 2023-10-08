import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
		int r=0;
		r=A.compareTo(B);
        /* Enter your code here. Print output to STDOUT. */
       System.out.println((A.length())+ (B.length())); 
       if(r== (-1)){
           
           System.out.println("Yes");
       }
        else 
        {
            System.out.println("No");
        }
        String c=A.substring(0, 1).toUpperCase() + A.substring(1);
        System.out.print(c);
        String p=B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(" "+p);
    }
}



