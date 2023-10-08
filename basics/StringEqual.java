class StringEqual
{ StringEqual(String str)
{
}
public static void main(String[] args)
{ //Object class equals() method executed (reference comparison)
StringEqual t1 = new StringEqual("ratan");
StringEqual t2 = new StringEqual("ratan");
System.out.println(t1.equals(t2));
//String class equals() method executed (content comparison)
String str1="anu";
String str2="anu";
System.out.println(str1.equals(str2));
//String class equals() method executed (content comparison)
String s1 = new String("Sravya");
String s2 = new String("Sravya");
System.out.println(s1.equals(s2));
//StringBuffer class not overriding equals() method so object class equals executed
StringBuffer sb1 = new StringBuffer("anu");
StringBuffer sb2 = new StringBuffer("anu");
System.out.println(sb1.equals(sb2));
}
}