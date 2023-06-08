class test
{
void show()
{
System.out.println("D");
}
}
class xyz extends test
{

void show()
{
System.out.println("A");
super.show();
}

}

class uvw extends xyz
{

void show()
{
System.out.println("C");
super.show();
}

}

