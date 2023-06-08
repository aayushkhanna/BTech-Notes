class abc
{
private void f()
{}

void f1()
{}

protected void f2()
{}

public void f3()
{}

}

class xyz extends abc
{

void f() //OK
{}

void f1() //Ok
{}

void f2() //error
{}

void f3() //error
{}
}