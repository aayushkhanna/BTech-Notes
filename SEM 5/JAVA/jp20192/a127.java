/*
throw
-----
throw is used to generate an exception explicitly.
*/
class abc
{
public static void main(String s[])
{

int a,b,c;

a=Integer.parseInt(s[0]);
b=Integer.parseInt(s[1]);

if(b<0)
 throw new ArithmeticException("Denominator cannot be negative");

if(a>100)
 throw new ArithmeticException("Number is >100");

c=a/b;

System.out.println(c);

System.out.println("Bye");

}
}