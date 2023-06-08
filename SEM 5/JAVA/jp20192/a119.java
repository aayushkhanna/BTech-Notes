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
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Some input is missing");
}
catch(ArithmeticException e)
{
System.out.println("Some arithemtic error");
}
catch(NumberFormatException e)
{
System.out.println("conversion error");
}


System.out.println("Bye");

}
}