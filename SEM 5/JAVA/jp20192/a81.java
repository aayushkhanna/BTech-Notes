class test
{
public static void main(String s[])
{
abc t1=new abc();
t1.show();

xyz t2=new xyz();
t2.display();

abc t3=t2;//OK
//xyz t4=t1;//Error

t3.show();
t3.display();//error
}
}
/*
Super class reference to sub class object
----------------------------
Super class reference can refer to sub class object, but it will refer to the subobject of super class inherited by that sub class.

So, in this case, super class reference can only access functions inherited from that super class.

*/