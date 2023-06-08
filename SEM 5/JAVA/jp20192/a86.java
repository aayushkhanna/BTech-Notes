//abstract function & abstract class
abstract class abc
{
abstract void f();
abstract void f1();
void f2()
{
System.out.println("A");
}
}

class xyz extends abc
{
void f()
{
System.out.println("C");
}

void f1()
{
System.out.println("D");
}

void k()
{
System.out.println("B");
}
}

