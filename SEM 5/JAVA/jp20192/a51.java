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

void add(distance a,distance b)
{
ft=a.ft+b.ft;
inch=a.inch+b.inch;
}

}