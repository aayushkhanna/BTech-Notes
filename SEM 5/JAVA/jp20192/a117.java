/*
static String valueOf(long)
static String valueOf(double)
static String valueOf(char[])
*/
class abc
{
public static void main(String s[])
{
int a=98765;
String s1=String.valueOf(a);
System.out.println(s1);//98765

s1=String.valueOf(56.765);
System.out.println(s1);//56.675

char k[]={'a','b','c'};
s1=String.valueOf(k);
System.out.println(s1);//abc
}
}