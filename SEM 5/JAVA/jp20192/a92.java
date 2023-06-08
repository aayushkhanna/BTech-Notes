abstract class shape
{
abstract void area();
}

class circle extends shape
{
int radius;

circle()
{
radius=0;
}

circle(int radius)
{
this.radius=radius;
}

void show()
{
System.out.println("Radius: "+radius);
}

void area()
{
double a=3.14*radius*radius;
System.out.println("Area: "+a);
}

}

class rect extends shape
{
int w,h;

rect(int w,int h)
{
this.w=w;
this.h=h;
}

void display()
{
System.out.println(w+","+h);
}


void area()
{
int a=w*h;
System.out.println("Area: "+a);
}

}

class test
{
public static void main(String s[])
{
circle c1=new circle(5);
c1.show();//5
c1.area();//78.5

rect r1=new rect(10,6);
r1.display();//10,6
r1.area();//60

shape s1=c1;
s1.area();//78.5
s1=r1;
s1.area();//60
}
}
