/*
throws
------
throws is used make declaration by function that specified checked exception might be thrown by this function.

*/

class abc
{

public static void main(String s[]) throws ClassNotFoundException
{

int a=Integer.parseInt(s[0]);

if(a<0)
 throw new ClassNotFoundException("Negative number"); 

if(a>100)
 throw new ArithmeticException("too large number"); 

System.out.println(a);

System.out.println("bye");
}

}