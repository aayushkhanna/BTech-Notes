/*
toString method is defined in Object class which is inherited by all classes in Java. 
This method is used to provide String representation of object.
*/

class xyz
{
}

class abc
{
public static void main(String s[])
{

xyz t=new xyz();

String k=t.toString();
System.out.println(k);

System.out.println(t.toString());
System.out.println(t);//most preferred

}
}