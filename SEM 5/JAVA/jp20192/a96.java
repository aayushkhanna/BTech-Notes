interface abc
{
int a=10;
void f();
void f1(int k);
}

class xyz implements abc
{

public void f()
{
System.out.println("B");
}

public void f1(int n)
{
System.out.println("C");
//a=50; //error
}

void k()
{
System.out.println("A");
}

}