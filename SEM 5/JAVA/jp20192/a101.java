
interface abc
{
void f();
}

interface abc1 extends abc
{
void m();
}

class xyz implements abc1
{

public void f()
{
System.out.println("B");
}

public void m()
{
System.out.println("c");
}

void k()
{
System.out.println("A");
}

}