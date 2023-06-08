//Function Overriding : when a sub class has function with same name and same signature(return type & arguments) as that in its super class then it is known as function overrriding. In case of function overriding, sub class reference will prefer calling its own function than the overriden function of its super class.

class xyz
{

void show()
{
System.out.println("A");
}

}

class uvw extends xyz
{

void display()
{
System.out.println("B");
}

void show()
{
System.out.println("C");
}

}

