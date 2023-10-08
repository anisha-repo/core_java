import java.util.Scanner;
public class EvenOdd{
public static void main(String s[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a numbers:-");
int a = sc.nextInt();
if(a%2==0)
System.out.println(a + "is even number");
else 
	System.out.println("not even number");
sc.close();
}
}