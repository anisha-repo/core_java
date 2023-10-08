import java.lang.*;
import java.util.Scanner;
class Demostring{
       public static void main(String arg[]){
                  //creating a String in 3 ways
                       String s1 = "my name is Anisha";
                    String s2 = new String("i like coding");
                  char arr[] = {'A','y','u','s','h'};
                       String s3 = new String(arr);

               
			   
			   System.out.println(s1);
          System.out.println(s2);
            System.out.println(s3);
			
			//length of first string
			System.out.println("the length of first string is " + s1.length());
           System.out.println("the length o second string is " + s2.length());

		   //character at a specified location
			System.out.println("Enter a location ");
			Scanner sc = new Scanner(System.in);
			int loc = sc.nextInt();
			System.out.println("the charachter at " + loc + " is :" + s2.charAt(loc));
			
			//comparing two string which string is bigger
			System.out.println("s1 compared to s2 "+ s1.compareTo(s2));
			String s4 = "ayush";
			String s5 = "Ayush";
			String s6 = "anisha";
			System.out.println(s4.compareToIgnoreCase(s5));
			System.out.println(s4.compareToIgnoreCase(s6));
}
}
