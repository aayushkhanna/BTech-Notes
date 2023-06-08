class abc
{
public static void main(String s[])
{

distance d1=new distance(2,3);
d1.show(); //2'3"

distance d2;
d2=d1;

d2.show(); //2'3"

d1.setdata(5,7);
d1.show(); //5'7"
d2.show(); //5'7"

d2.setdata(9,3);
d1.show(); //9'3"
d2.show(); //9'3"

d1=new distance(8,4);
d1.show();//8'4"
d2.show();//9'3"

d1.setdata(2,1);
d1.show(); //2'1"
d2.show(); //9'3"

d2=d1;
d1.show(); //2'1"
d2.show(); //2'1"



}
}