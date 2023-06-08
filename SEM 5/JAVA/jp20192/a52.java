class abc
{
public static void main(String s[])
{

distance d1=new distance(2,3);
distance d2=new distance(7,8);
distance d3=new distance();

d3.add(d1,d2);

d3.show(); //9'11"
d1.show(); //2'3"
d2.show(); //7'8"


}
}