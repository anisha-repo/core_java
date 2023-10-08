import java.util.Scanner;
class Plus{
 public static void main(String args[]){
    System.out.println("enter three number");
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int a=sc.nextInt();
    System.out.println("enter second number");
    int b=sc.nextInt();
    System.out.println("enter third number");
    int c=sc.nextInt();
    int sum=a+b+c;
    System.out.println("sum is:"+sum);
    sc.close();
 }
}
