class abc
{
public static void main(String s[])
{

int a,b,c;

a=Integer.parseInt(s[0]);
b=Integer.parseInt(s[1]);

c=a/b;

System.out.println(c);

System.out.println("Bye");

}
}

/*
java abc 20 10		2 Bye
java abc 20		AIOOBE : 1
java abc 		AIOOBE : 0
java abc 20 test	NFE : test
java abc 20 0		AE : / by zero

*/