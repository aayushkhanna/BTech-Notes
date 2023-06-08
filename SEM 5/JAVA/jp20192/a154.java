import java.util.*;
import java.text.*;

class abc
{
public static void main(String s[]) throws ParseException
{

Calendar c=Calendar.getInstance();

Date d=c.getTime();

System.out.println(d); //current date/time

c.add(Calendar.MONTH,1);
c.set(Calendar.DATE,1);
c.add(Calendar.DATE,-1);

int n=c.get(Calendar.DATE);
System.out.println(n); //30

n=c.getActualMaximum(Calendar.DATE);
System.out.println(n); //30 
}
}
