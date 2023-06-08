//returning reference from function
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

distance add(distance r)
{
distance t=new distance();
t.ft=ft+r.ft;
t.inch=inch+r.inch;
return t;
}
}