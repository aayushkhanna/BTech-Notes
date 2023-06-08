//Nested try Catch
class abc
{
public static void main(String s[])
{

int a,b,c;
try
{
a=Integer.parseInt(s[0]);
b=Integer.parseInt(s[1]);

  try
  {
   c=a/b;
   System.out.println(c);
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
    System.out.println("inner1");
  }
  catch(ArithmeticException e)
  {
    System.out.println("inner2");
  }

System.out.println("hello");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Outer1");
}
catch(ArithmeticException e)
{
System.out.println("Outer2");
}
System.out.println("Bye");

}
}