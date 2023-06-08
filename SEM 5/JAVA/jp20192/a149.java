//string to date conversion

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class abc
{
public static void main(String s[]) throws ParseException
{

String x=s[0];
String y=s[1];

SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");

Date d1=f.parse(x);  
Date d2=f.parse(y); 

if(d1.after(d2))
 System.out.println("d1 comes after d2");
else if(d1.before(d2))
 System.out.println("d1 comes before d2");
else
 System.out.println("d1 equals d2");	

}
}
