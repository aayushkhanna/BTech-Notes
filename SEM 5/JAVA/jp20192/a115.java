/*
boolean equals(String)
boolean equalsIgnoreCase(String)
int compareTo(String)
int compareToIgnoreCase(String)
*/
class abc
{
public static void main(String s[])
{
String s1="hello";

System.out.println(s1.equals("hello"));//true
System.out.println(s1.equals("Hello"));//false

System.out.println(s1.equalsIgnoreCase("hello"));//true
System.out.println(s1.equalsIgnoreCase("Hello"));//true

s1="abcde";
String s2="abcfz";

int n=s1.compareTo(s2);
System.out.println(n);//-2

s1="abcde";
s2="aBcde";

n=s1.compareTo(s2);
System.out.println(n);//32

n=s1.compareToIgnoreCase(s2);
System.out.println(n);//0

}
}