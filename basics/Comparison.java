import java.util.Scanner;
public class Comparison{
    public static void main(String str[]){
        Scanner sc= new Scanner(System.in);
        int a=45;
        System.out.println("enter any number;-");
        int n= sc.nextInt();
        if(a>n)
        System.out.println("number is small");
        else
        System.out.println("number is large");
        sc.close();
    }
}