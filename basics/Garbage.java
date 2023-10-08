class Garbage{

public static void main(String[] args)
{ Garbage t1 = new Garbage();
Garbage t2 = new Garbage();
System.out.println(t1.toString());
System.out.println(t2.toString());
;;;;;;;;//using object
t1=null;
t2=null;
System.gc();
}
}