//string to date conversion

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class abc
{
public static void main(String s[]) throws ParseException
{

String x="03/05/2019";
SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");

Date d=f.parse(x);  //convert string to date
System.out.println(d);

}
}
