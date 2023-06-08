class abc
{
public static void main(String s[])
{
distance d=new distance();
d.show(); //0'0"

d.input(); //3 4
d.show(); //3'4"

d.setdata();
d.show(); //0'0"

d.setdata(10);
d.show(); //10'0"

d.setdata(9,2);
d.show(); //9'2"


}
}