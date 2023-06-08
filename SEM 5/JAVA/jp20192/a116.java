/*

== vs equals

== compares references only
equals compares character by character

*/
class abc
{
public static void main(String s[])
{
String s1="hello";

String s2=s1;

System.out.println(s1==s2);//true
System.out.println(s1.equals(s2));//true

String s3=new String(s1);
System.out.println(s1==s3);//false
System.out.println(s1.equals(s3));//true

}
}