import java.util.Scanner;
public class ExchangeValue {
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values of a");
    int a=sc.nextInt();
    System.out.println("enter value of b");
    int b=sc.nextInt();
    int t;
    t=a;
    a=b;
    b=t;
    System.out.println("tha value a= "+ a);
    System.out.println("th value of b = "+ b);
    sc.close();

    }
}
