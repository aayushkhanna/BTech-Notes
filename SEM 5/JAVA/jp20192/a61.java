//static keyword
class distance
{
int ft;
static int inch;

static
{
System.out.println("Static block called");
}

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

static void display()
{
//System.out.println(ft);//error
System.out.println(inch);
//show();//error
}

}