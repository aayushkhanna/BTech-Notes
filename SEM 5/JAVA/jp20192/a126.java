/*
finally block
-------------
Finally block is used with try block and will always execute whether exception occurs or not and whether exception is handled or not.
In short, Finally block is MUST execute block
*/
class abc
{
public static void main(String s[])
{

int a,b,c;

try
{
a=Integer.parseInt(s[0]);
b=Integer.parseInt(s[1]);

c=a/b;

System.out.println(c);
}
catch(ArithmeticException e)
{
  e.printStackTrace();
}
finally
{
System.out.println("In finally block");
}

System.out.println("Bye");

}
}