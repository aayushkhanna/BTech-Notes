class distance
{
int ft,inch;

distance()
{
ft=0;
inch=0;
}

distance(int a,int b)
{
ft=a;
inch=b;
}

void show()
{
System.out.println(ft+"'"+inch+"\"");
}

void setdata(int a,int b)
{
ft=a;
inch=b;
}

void xyz(distance t)
{
t.ft=5;
t.inch=9;
}

void test(distance k)
{
k.ft=3;
k.inch=6;
ft=2;
inch=9;
}
}