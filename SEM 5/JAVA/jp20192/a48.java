class abc
{
public static void main(String s[])
{

distance d1=new distance(2,3);
distance d2=new distance(7,8);
distance d3;

d3=d1;
d3.setdata(6,9);

d2=d1;
d2.setdata(4,1);

d1=d2;
d1.setdata(9,2);

d1.show();//9'2" 
d2.show();//9'2" 
d2.show();//9'2" 


}
}