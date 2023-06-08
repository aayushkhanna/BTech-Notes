import java.util.Date;

class abc
{

public static void main(String s[])
{

Date d=new Date();     //initializes with current date/time
System.out.println(d);

Date d1=new Date(0);  //initializes date using given msecs passed 			since 1-1-1970 0:0:0 hours
System.out.println(d1); //Jan 1, 1970 0:0:0 GMT

d1=new Date(24*60*60*1000);
System.out.println(d1); //Jan 2, 1970 0:0:0 GMT

d1=new Date(-24*60*60*1000);
System.out.println(d1); //Dec 31, 1969 0:0:0 GMT

long t1=System.currentTimeMillis();
d1=new Date(t1+24*60*60*1000);
System.out.println(d1); //Jun 19, 2019 10:46:XX IST

}

}