//Formatting of date time
import java.util.Date;
import java.text.SimpleDateFormat;

class abc
{
public static void main(String s[])
{

Date d=new Date();
System.out.println(d);		

SimpleDateFormat k=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss.SSS a E z");
String p=k.format(d);
System.out.println(p);

k=new SimpleDateFormat("dd-MMM-yyyy");
p=k.format(d);
System.out.println(p);

k=new SimpleDateFormat("MM/dd/yyyy");
p=k.format(d);
System.out.println(p);

k=new SimpleDateFormat("'he arrived on 'dd-MMM-yyyy' at 'HH:mm");
p=k.format(d);
System.out.println(p);

}
}

/*
d	1-31
dd	01-31
M	1-12
MM	01-12
MMM	jan-dec
yyyy	2019
yy	19
h	2
hh	02
H	14
HH	14
m	7
mm	07
s	5
ss	05
SSS	109 msecs
a	am/pm
E	day
Z	timezone
*/