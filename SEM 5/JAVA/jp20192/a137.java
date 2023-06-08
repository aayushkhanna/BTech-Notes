class student
{
int roll;
String name;

student(int roll,String name)
{
this.roll=roll;
this.name=name;
}

public String toString()
{
//return String.valueOf(roll);
//return roll+"";
return roll+","+name;
}

}

class abc
{
public static void main(String s[])
{

student s1=new student(100,"aman");
System.out.println(s1);

try
{
int a=Integer.parseInt(s[0]);
System.out.println(a);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}

System.out.println("Bye");
}
}