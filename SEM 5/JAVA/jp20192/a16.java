class abc
{
public static void main(String s[])
{

byte a,b,c;
a=12;
b=7;
c=(byte)(a&b);
System.out.println(c); //4;

c=(byte)(a|b);
System.out.println(c); //15;

c=(byte)(a^b);
System.out.println(c); //11;


}
}

