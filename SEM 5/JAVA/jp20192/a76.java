class xyz 
{
int x,y;
xyz(int x,int y)
{
this.x=x;
this.y=y;
}
void show()
{
System.out.println(x+","+y);
}
}

class uvw extends xyz
{
int a;
uvw(int a,int b,int c)
{
super(b,c);
this.a=a;
}

void show()
{
System.out.println(a);
super.show();
}
}

