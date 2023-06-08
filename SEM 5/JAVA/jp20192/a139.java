/*
user defined exceptions falls under checked exception category
*/
class xyz extends Exception
{
String h;
xyz(String h)
{
this.h=h;
}

public String toString()
{
 return h;
}
}


class abc
{
public static void main(String s[]) throws xyz
{

try
{
if(s.length==1)
 throw new xyz("One parameter exception");

if(s.length==2)
 throw new xyz("two parameters exception");

}
catch(xyz k)
{
System.out.println(k);
}

}
}