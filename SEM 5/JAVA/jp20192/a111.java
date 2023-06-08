class abc
{
public static void main(String s[])
{
String s1="this is his decision";

String s2="is";

int n,i=0,count=0;

while(i<=s1.lastIndexOf(s2))
{

n=s1.indexOf(s2,i);

if(n!=-1)
 count++;


i=n+s2.length();
}

System.out.println(count);
}
}