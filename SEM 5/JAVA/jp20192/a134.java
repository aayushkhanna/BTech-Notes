/*
user defined exceptions falls under checked exception category
*/

class xyz extends Exception
{


}


class abc
{
public static void main(String s[]) throws xyz
{

if(s.length>0)
 throw new xyz();


}
}