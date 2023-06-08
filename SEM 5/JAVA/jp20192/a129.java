import java.util.Scanner;

class abc
{
public static void main(String s[])
{

Scanner k=new Scanner(System.in);
System.out.println("Input string: ");
String y=k.nextLine();

boolean b=isValidName(y);
if(b)
 System.out.println("Valid Name");
else
 System.out.println("Invalid Name");

}

static boolean isValidName(String x)
{
if(x.length()<3)
  return false;

if(x.startsWith("."))
  return false;

if(x.contains(".."))
  return false;

if(x.contains(". "))
  return false;

if(x.contains(" ."))
  return false;

String h=x.toLowerCase();
char a;
for(int i=0;i<x.length();i++)
{
   a=x.charAt(i);
   if(a<97 || a>122)
   {
	if(a!='.' && a!=' ')
	  return false;
   }	
}

return true;
}
}