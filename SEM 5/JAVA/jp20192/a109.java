/*
boolean contains(String)
boolean startsWith(String)
boolean endsWith(String)
*/
class abc
{
public static void main(String s[])
{
String s1="this is his decision";

boolean b=s1.contains("his");
System.out.println(b); //true

b=s1.contains("cis");
System.out.println(b); //true

b=s1.contains(" is ");
System.out.println(b); //true

b=s1.contains("is");
System.out.println(b); //true

b=s1.contains("test");
System.out.println(b); //false

b=s1.startsWith("th");
System.out.println(b); //true

b=s1.startsWith("td");
System.out.println(b); //false

b=s1.endsWith("sion");
System.out.println(b); //true

b=s1.endsWith("xyz");
System.out.println(b); //false

}
}