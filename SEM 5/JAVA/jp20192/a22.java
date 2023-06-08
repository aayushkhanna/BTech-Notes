class abc
{
public static void main(String s[])
{

int x[]=new int[7];
System.out.println(x.length);

for(int i=0;i<x.length;i++)
{
 System.out.println(x[i]);
}

x[0]=90;
x[1]=91;
x[2]=19;
x[3]=43;
x[4]=56;

for(int i=0;i<x.length;i++)
{
 System.out.println(x[i]);
}

}
}

