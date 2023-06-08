abstract class abc
{
int x;
abc(int x)
{
this.x=x;
}
void show()
{
System.out.println(x);
}
}

class xyz extends abc
{
int y;
xyz(int a,int y)
{
super(a);
this.y=y;
}

void show()
{
super.show();
System.out.println(y);
}
}

