
import java.util.Scanner;
public class PercentageOfMarks{
    public static void main(String st[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your 5 subject Marks:-");
        System.out.print("Math marks:- ");
        float math=sc.nextFloat();
        System.out.print("english marks:- ");
        float english=sc.nextFloat();
        System.out.print("Hindi marks:- ");
        float hindi = sc.nextFloat();
        System.out.print("science marks:- ");
        float science = sc.nextFloat();
        System.out.print("sst marks:- ");
        float sst = sc.nextFloat();
        float total=math+english+hindi+science+sst;
        float percentage=(total*100)/500;
        System.out.println("your percentage =" + percentage);
        float cgpa = total/50;
        System.out.print("cgpa="+cgpa);
        sc.close();

    }
}