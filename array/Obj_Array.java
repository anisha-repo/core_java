//store objects in array
import java.util.Scanner;
import java.lang.String;
public class Obj_Array {
   public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int Size=sc.nextInt();
     Employee[] arr=new Employee[Size];
     for(int i=0;i<Size;i++)
     {
        System.out.println("enter id and name of employee:-");
        int id=sc.nextInt();
        String name=sc.nextLine();
        arr[i]=new Employee(id,name);
     }
     System.out.println("the Employee data are as follow:-");
     for(int i=0;i<Size;i++)
     {
      arr[i].display_Data();
     }
     sc.close();
   } 

}
 class Employee{
    int id;
    String name;
    Employee(int i,String n)
    {
       id=i;
       name=n;
    }
    void display_Data()
    {
      
     System.out.print(id + " \t" + name);
     System.out.println();
    }
}
