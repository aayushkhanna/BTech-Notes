class xyz 
{
xyz()
{
System.out.println("A");
}

xyz(int x)
{
System.out.println("Z");
}
}

class uvw extends xyz
{

uvw()
{
super(5);
System.out.println("B");
}

uvw(int a)
{
super(7);
System.out.println("C");
}

}

