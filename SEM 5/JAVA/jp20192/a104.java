class abc
{
public static void main(String s[])
{
String s1="helLoWoRLd";
int c=0;
for(int i=0;i<s1.length();i++)
{
  char x=s1.charAt(i);
  if(x>='A' && x<='Z')
    c++;
}

System.out.println("Count is "+c);
}
}