class xyz
{

void show()
{
System.out.println("A");
}

}

class uvw extends xyz
{

void display()
{
System.out.println("B");
show();
super.show();//calls super class function
}

void show()
{
System.out.println("C");
}

}

