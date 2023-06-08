import java.util.Scanner;

class abc
{
public static void main(String s[])
{

Scanner k=new Scanner(System.in);
System.out.println("Input string: ");
String y=k.nextLine();

boolean b=isValidPinCode(y);
if(b)
 System.out.println("Valid Pin code");
else
 System.out.println("Invalid Pin code");


}

static boolean isValidPinCode(String x)
{

if(x.length()!=6)
 return false;

if(x.startsWith("0"))
 return false;

char p;
for(int i=0;i<x.length();i++)
{
 p=x.charAt(i);
 if(p<48 || p>57)
 {
   return false;
 }
}

return true;
}
}