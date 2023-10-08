/* Java program to create a class called Animal with a method called makeSound().
 Create a subclass called Cat that overrides the makeSound() method to bark.
*/
import java.lang.*;
import java.util.Scanner;
      
	  
	  class Animal          //Animal class
       {
 
              void makeSound()  
                {
                 
				 System.out.println("this function will give animal sound");
  
                }
        }
        
	  class Cat extends Animal        //class cat inherit the Animal class by using extends keyword
        {
                void makeSound()         
                {
  
                   System.out.println("cat barks");
                }
        }
	class Animal_sound
	    {
      public static void main(String[] arg)
        {
           Animal A=new Animal();
		   A.makeSound();
		   Cat c = new Cat();
            c.makeSound();
         
		}
		} 