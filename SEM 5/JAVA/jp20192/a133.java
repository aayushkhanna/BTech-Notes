class abc
{

static void f(int k) throws ClassNotFoundException
{
if(k<0)
 throw new ClassNotFoundException("Negative number"); 

System.out.println(k);
}

static void z(int p) throws ClassNotFoundException
{
 f(p);
}

public static void main(String s[]) throws ClassNotFoundException
{
int a=Integer.parseInt(s[0]);

z(a);

System.out.println("bye");
}

}