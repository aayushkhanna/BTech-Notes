//final keyword with method prevents overriding

class abc
{
final void f()
{

}

}

class xyz extends abc
{

void f()
{

}

}

