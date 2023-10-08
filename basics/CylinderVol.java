import java.util.Scanner;
public class CylinderVol {
    public static void main(String str[]){
        System.out.println("enter height and radius of cylinder");
        Scanner sc=new Scanner(System.in);
        float height=sc.nextFloat();
        float radius=sc.nextFloat();
        float volume=22/7*radius*radius*height;
        float tsa=2*22/7*radius*radius+radius*height;
        System.out.println("volume of cylinder = "+ volume );
        System.out.println("total surface area of cylinder =" + tsa);
        sc.close();
    }

}
