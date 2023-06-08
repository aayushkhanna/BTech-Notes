class xyz
{

public String toString()
{
return "test";
}
}

class abc
{
public static void main(String s[])
{
xyz t=new xyz();

String k=t.toString();
System.out.println(k);

System.out.println(t.toString());
System.out.println(t);

}
}