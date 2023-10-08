import java.util.Scanner;
public class SumAndMulti {
    public static void main(String str[]){
            System.out.println("enter any two number");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum,prod;
            sum=a+b;
            prod=a*b;
            System.out.println("the sum of "+a +" and " + b +" are "+ sum);
            System.out.println("the product of  "+a +" and " + b +" are "+ prod);
            sc.close();
    }
}
