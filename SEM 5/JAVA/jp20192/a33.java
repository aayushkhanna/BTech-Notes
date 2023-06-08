import java.util.Scanner;

class distance
{
int ft,inch;

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
r.input();
r.show();

}
}