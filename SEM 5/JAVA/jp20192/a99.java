class test
{
public static void main(String s[])
{
xyz t1=new xyz();
t1.f();
t1.m();
t1.k();

abc p=t1;
p.f();//ok
p.m();//error
p.k();//error


abc1 p1=t1;
p1.f();//error
p1.m();//ok
p1.k();//error


}
}