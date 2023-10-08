import java.util.Scanner;
class Greet{
    public static void main(String arg[]){
        System.out.println("enter your name");
        Scanner nm=new Scanner(System.in);
        String s = nm.next();
        System.out.print("hello  ");
        System.out.print( s);
        System.out.print("  have a good day!");
        nm.close();
    }

}