//learning package

package ani;                       /*The package keyword is used to create a package in java*/
import ani_yush.*;
import abc.Tata;
public class Mypack
{
 public static void main(String[] arg)
 {
  System.out.println("My Package");
  Say_hello s = new Say_hello();
  s.msg();
  Tata t = new Tata();
  t.say_tata();
 }
}