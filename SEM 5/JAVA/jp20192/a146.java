import java.util.Date;

class abc
{

public static void main(String s[])
{

Date d=new Date();     

long t=d.getTime();

System.out.println(d); //Jun 18, 2019 10:46:XX IST
System.out.println(t); //msecs passed since 1-1-1970 to date

Date d1=new Date(t+120*60*60*1000);
System.out.println(d1); //Jun 23, 2019 10:46:XX IST

boolean b=d.after(d1);
System.out.println(b);//false

b=d.before(d1);
System.out.println(b);//true

}

}