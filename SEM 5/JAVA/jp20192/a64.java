class xyz
{

void show()
{
System.out.println("AB");
}

}

class uvw extends xyz
{

void display()
{
System.out.println("B");
}

}

class abc
{
public static void main(String s[])
{
xyz t2=new xyz();
t2.show(); //A

uvw t1=new uvw();
t1.show(); //A
t1.display(); //B
}
}

