/*
String toUpperCase()
String toLowerCase()
String replace(char,char)
String trim()
*/
class abc
{
public static void main(String s[])
{
String s1="helLoWoRLd";

String s2=s1.toUpperCase();

System.out.println(s1);//helLoWoRLd
System.out.println(s2);//HELLOWORLD


s2=s1.toLowerCase();
System.out.println(s1);//helLoWoRLd
System.out.println(s2);//helloworld

s2=s1.replace('o','z');
System.out.println(s1);//helLoWoRLd
System.out.println(s2);//helLzWzRLd

s1="     hello world     ";
System.out.println(s1);//     hello world    
System.out.println(s1.length());//21

s2=s1.trim();
System.out.println(s1);//     hello world    
System.out.println(s1.length());//21
System.out.println(s2);//hello world    
System.out.println(s2.length());//11


}
}