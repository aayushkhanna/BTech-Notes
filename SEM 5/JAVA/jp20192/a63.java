class abc
{
int a;
static int b;

abc(int a,int b)
{
this.a=a;
this.b=b;
}

void show()
{
System.out.println(a+","+b);
display();
}

static void display()
{
System.out.println(a); //error
System.out.println(b);
show(); //error
}

public static void main(String s[])
{
abc t=new abc(10,2);
t.show(); 		
abc m=new abc();	//error
show();			//error
display();		
}

}