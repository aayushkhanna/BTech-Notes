class abc
{

public static void main(String s[])
{

try
{
int a=Integer.parseInt(s[0]);

if(a<0)
 throw new ClassNotFoundException("Negative number"); 

if(a>100)
 throw new ArithmeticException("too large number"); 

System.out.println(a);
}
catch(ClassNotFoundException e)
{
 e.printStackTrace();
}

System.out.println("bye");
}

}