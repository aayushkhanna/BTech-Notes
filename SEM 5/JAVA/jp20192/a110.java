/*
int indexOf(int character)
int indexOf(int character,int starts)
int indexOf(String)
int indexOf(String,int starts)

int lastIndexOf(int character)
int lastIndexOf(int character,int ends)
int lastIndexOf(String)
int lastIndexOf(String,int ends)
*/
class abc
{
public static void main(String s[])
{
String s1="this is his decision";

int n;

n=s1.indexOf('s');
System.out.println(n); //3

n=s1.indexOf('s',8);
System.out.println(n); //10

n=s1.indexOf("is");
System.out.println(n); //2

n=s1.indexOf("is",8);
System.out.println(n); //9

n=s1.lastIndexOf('s');
System.out.println(n); //16

n=s1.lastIndexOf('s',8);
System.out.println(n); //6

n=s1.lastIndexOf("is");
System.out.println(n); //15

n=s1.lastIndexOf("is",8);
System.out.println(n); //5

n=s1.indexOf("test",8);
System.out.println(n); //-1

n=s1.lastIndexOf("test",8);
System.out.println(n); //-1


}
}