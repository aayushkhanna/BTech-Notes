/*
user defined exceptions falls under checked exception category
*/

class xyz extends Exception
{

public String toString()
{
 return "my exception";
}
}


class abc
{
public static void main(String s[]) throws xyz
{

if(s.length>0)
 throw new xyz();


}
}