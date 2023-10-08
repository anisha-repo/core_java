import java.lang.*;
import java.util.Scanner;
class Person{

   String name;
   int age;
   String gender;
   void talkToPeople(){
	   System.out.println("hi my name is " + name + ", my age is " + age + "and my gender is " + gender);
   }
}
class Main{
  
  public static void main(String arg[]){
  
  Person raju = new Person();
  System.out.println("hascode of object raju "+ raju.hashCode());
  raju.name= "mohan lal";
  raju.age = 45;
  raju.gender = "male";
  raju.talkToPeople();
  
  }
}