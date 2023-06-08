

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class abc
{
public static void main(String s[]) throws ParseException
{

String x=s[0];

SimpleDateFormat f=new SimpleDateFormat("dd-MMM-yyyy");

Date d1=f.parse(x);  

f=new SimpleDateFormat("E");

String p=f.format(d1);
System.out.println(p);

}
}
