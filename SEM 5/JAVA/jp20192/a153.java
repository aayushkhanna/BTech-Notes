import java.util.*;
import java.text.*;

class abc
{
public static void main(String s[]) throws ParseException
{

Calendar c=Calendar.getInstance();

Date d=c.getTime();

System.out.println(d); //current date/time

c.add(Calendar.MONTH,2);

d=c.getTime();
System.out.println(d); 
}
}
