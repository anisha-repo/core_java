/*Java program to create a class called Employee with methods called work() and getSalary(). 
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
*/
import java.lang.*;
import java.util.Scanner;
  class Employee
  {
    void work()
    {
      	 System.out.println("employee work 8 hours per day");
    }
    void getSalary()
    {
	  System.out.println("salary 25000");
    }
  }
  class HRManager extends Employee
  {
       void work()
       {
          System.out.println("HR manager decides the salary of employee");
   
        }
        void addEmployee()
        {
	    
         System.out.println("there is a need a new employees");
		 
	    }
  }
  class Office
  {
  
  public static void main(String[] arg)
  {
  
  Employee e = new Employee();
  HRManager hr = new HRManager();
  hr.work();
  
  }  
  }