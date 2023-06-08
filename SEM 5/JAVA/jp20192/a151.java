import java.util.Calendar;
import java.util.Date;
import java.text.*;

class abc
{
public static void main(String s[]) throws ParseException
{

Calendar c=Calendar.getInstance();

Date d=c.getTime();

System.out.println(d); //current date/time

int n;
n=c.get(Calendar.DATE);
System.out.println(n); //19

n=c.get(Calendar.MONTH);
System.out.println(n); //5

n=c.get(Calendar.YEAR);
System.out.println(n); //2019

n=c.get(Calendar.HOUR);
System.out.println(n); //11

n=c.get(Calendar.MINUTE);
System.out.println(n); //0

n=c.get(Calendar.SECOND);
System.out.println(n); //29

n=c.get(Calendar.WEEK_OF_YEAR);
System.out.println(n); //25

n=c.get(Calendar.DAY_OF_WEEK);
System.out.println(n); //4

c.set(Calendar.MONTH,8);
c.set(Calendar.YEAR,2022);

d=c.getTime();

System.out.println(d); //19 sep 2022

String k="09-jan-1988";
SimpleDateFormat f=new SimpleDateFormat("dd-MMM-yyyy");
Date d1=f.parse(k);

c.setTime(d1);
n=c.get(Calendar.WEEK_OF_YEAR);
System.out.println(n); //2

}
}
