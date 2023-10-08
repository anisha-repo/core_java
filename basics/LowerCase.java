import java.util.Scanner;
public class LowerCase{
    public static void main(String str[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        name=name.toLowerCase();
        System.out.println(name);
         System.out.println("enter your SCHOOL name");
         String school=sc.nextLine();
        school = school.replace(" ","_");
        System.out.println(school);
        sc.close();
    }
}