import java.util.Scanner;

class abc
{
public static void main(String s[])
{

Scanner k=new Scanner(System.in);

int n,flag,i;

System.out.println("Input number: ");
n=k.nextInt();

flag=1;
for(i=2;i<=n/2;i++)
{
  if(n%i==0)
  {
	flag=0;
	break;
  }
}

if(flag==1 && n>1)
 System.out.println("Prime");
else
 System.out.println("Not Prime");

}
}

