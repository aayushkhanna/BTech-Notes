class test
{
public static void main(String s[])
{
abc t1; //OK
//t1=new abc(); //error

xyz t2=new xyz();
t2.f();
t2.f1();
t2.f2();
t2.k();

t1=t2;
t1.f();
t1.f1();
t1.f2();
//t1.k();//error


}
}

