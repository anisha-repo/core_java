/*Java program to create a class called Vehicle with a method called drive().
 Create a subclass called Car that overrides the drive() method to print "Repairing a car".
*/
import java.lang.*;
  class Vehicle
   {
    void drive()
	{
	
	System.out.println("vehicles can be drived");
	
	}
   
   }
    
class Car extends Vehicle
{
    void drive()
	{
	 
	 System.out.println("reapairing a car");
	 
	}
}
class Vehicles
{	
 public static void main(String[] args)
 {
   
   Vehicle v = new Vehicle();
   Car c = new Car();
   c.drive();
   v.drive();
 
 }
}
