/*
String class
------------
String is a built-in class with few constrcutors and many functions.
Constructors
------------
String()
String(char[])
String(char[],int start,int count)
String(byte[])
String(byte[].int start,int count)
String(String)
*/
class abc
{
public static void main(String s[])
{
String s1=new String();
System.out.println(s1);//

char k[]={'a','b','c','d','g','h'};
String s2=new String(k);
System.out.println(s2);//abcdgh

String s3=new String(k,2,3);
System.out.println(s3);//cdg

byte b[]={65,66,67,68,69,70,71};
String s4=new String(b);
System.out.println(s4);//ABCDEFG

String s5=new String(b,1,4);
System.out.println(s5);//BCDE

String s6=new String(s2);
System.out.println(s6);//abcdgh

String s7="hello world";
System.out.println(s7);//hello world

String s8=new String("test");
System.out.println(s8);//test
}
}