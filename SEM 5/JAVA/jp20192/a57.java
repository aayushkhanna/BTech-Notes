/*
this keyword
------------
this is used inside the class to store reference of calling object.

this is implicitly implemented in the class.
*/

class distance
{
int ft,inch;

distance()
{
ft=0;		//this.ft=0;
this.inch=0;
}

distance(int a,int b)
{
this.ft=a;
this.inch=b;
}

void show()
{
System.out.println(this.ft+"'"+this.inch+"\"");
}

}