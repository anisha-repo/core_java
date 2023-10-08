import java.util.Scanner;
public class Sum{
    public static void main(String str[]){
        float sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
          int a = sc.nextInt();
          int b = sc.nextInt();
        int c = sc.nextInt();
          sum=a+b+c;
          System.out.println(sum);
          sc.close();
    }
}
