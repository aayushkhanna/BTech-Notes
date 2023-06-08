class abc
{
public static void main(String s[])
{

byte a,b,c;
a=2;
b=5;
c=a*b; //error
c=(byte)(a*b); //10
System.out.println(c);


}
}
/*
short and byte are promoted to int in expressions
*/

