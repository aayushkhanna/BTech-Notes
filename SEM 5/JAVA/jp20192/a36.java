import java.util.Scanner;

class distance
{
int ft=3,inch=5;

//default constructor
distance()
{
ft=6;
inch=2;
}

//parameteriazed constructor
distance(int a,int b)
{
ft=a;
inch=b;
}

void input()
{
Scanner k=new Scanner(System.in);
System.out.println("Input ft: ");
ft=k.nextInt();
System.out.println("Input inch: ");
inch=k.nextInt();
}

void show()
{
System.out.println(ft+"'"+inch+"\""); //3'4"
}

void setdata(int a,int b)
{
ft=a;
inch=b;
}

void setdata(int a)
{
ft=a;
inch=0;
}

void setdata()
{
ft=0;
inch=0;
}

public static void main(String s[])
{

distance r=new distance();
r.show(); //6'2"

distance r1=new distance(7,2);
r1.show(); 7'2"
}
}

