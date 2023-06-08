class abc
{
public static void main(String s[])
{

distance d1=new distance(2,3);
distance d2=new distance(7,8);

d1.xyz(d2);

d1.show();// 2'3"
d2.show();// 5'9"


d2.xyz(d1);
d1.show();// 5'9"
d2.show();// 5'9"

}
}