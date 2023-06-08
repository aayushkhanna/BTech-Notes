
class distance
{
int ft,inch;

distance()
{
ft=0;		
inch=0;
}

distance(int ft,int inch)
{
this.ft=ft;
this.inch=inch;
}

void show()
{
System.out.println(ft+"'"+inch+"\"");
}

}