import java.util.Scanner;
public class Grade{
    public static void main(String tr[]){
        System.out.println("enter your grade to encrypt it:-");
        Scanner sc= new Scanner(System.in);
        char gr= sc.next().charAt(0);
        gr = (char)(gr + 8);
        System.out.println(gr);
        sc.close();
    }
}