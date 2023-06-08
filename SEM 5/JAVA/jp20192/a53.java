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

void f(distance k)
{
k.ft+=2;
k.inch+=3;
p(k);
}

void p(distance z)
{
z.ft+=ft;
z.inch+=inch;
n(z);
}

void n(distance d)
{
ft+=d.ft;
inch+=d.inch;
}

}