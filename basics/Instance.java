class Test
{ int a=10;
static int b=20;
public static void main(String[] args)
{ Test t = new Test();
System.out.println(t.a);
System.out.println(Test.b);
t.a=111;
Test.b=222;
System.out.println(t.a);
System.out.println(Test.b);
Test t1 = new Test();
System.out.println(t1.a);
System.out.println(Test.b);
Test.b=333;
Test t2 = new Test();
System.out.println(t2.a);
System.out.println(Test.b);
}
}