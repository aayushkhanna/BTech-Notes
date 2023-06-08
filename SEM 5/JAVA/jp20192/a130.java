/*
Exceptions are of two types:

Unchecked Exceptions: These exceptions need not to be compulsarily handled.

Checked Exceptions: These exceptions MUST be handled otherwise compiler will generate error.
*/

class abc
{

public static void main(String s[])
{

int a=Integer.parseInt(s[0]);

if(a<0)
 throw new ClassNotFoundException(); 

System.out.println(a);

System.out.println("bye");

}

}