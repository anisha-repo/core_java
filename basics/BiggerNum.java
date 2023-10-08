import java.util.Scanner;
public class BiggerNum{
public static void main(String str[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter two number");
int a=sc.nextInt();
int b=sc.nextInt();
if(a>b)
System.out.println(a + " is bigger than " + b);
else
System.out.println(b + " is bigger than " + a);
sc.close();
}
}