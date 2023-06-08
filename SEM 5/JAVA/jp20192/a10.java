class abc
{
public static void main(String s[])
{

int a=10;
float b=2.5f;

float c=a*b;
System.out.println(c);//25

//int d=a*b;//error
//System.out.println(d);

int e=(int)(a*b);//OK
System.out.println(e);//25


}
}

