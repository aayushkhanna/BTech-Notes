/*
char charAt(int pos) 
char[] toCharArray()
byte[] getBytes()

int length()

*/
class abc
{
public static void main(String s[])
{
String s1="helloworld";
char n=s1.charAt(3);
System.out.println(n);//l


char x[]=s1.toCharArray();
for(int i=0;i<x.length;i++)
 System.out.print(x[i]+"\t");//h e l l o w o r l d

System.out.println();

byte b[]=s1.getBytes();
for(int i=0;i<b.length;i++)
 System.out.print(b[i]+"\t");//

System.out.println();

int k=s1.length();
System.out.println(k);

}
}