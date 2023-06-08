class abc
{

public static void main(String s[])
{

long t1=System.currentTimeMillis();//millisecs passed since 1-1-1970 0:0:0 hours

for(int i=1;i<=100;i++)
 System.out.println("A");

long t2=System.currentTimeMillis();

System.out.println("Time elapsed "+(t2-t1)+"ms");

}

}