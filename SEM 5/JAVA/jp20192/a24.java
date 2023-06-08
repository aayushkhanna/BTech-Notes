import java.util.Scanner;

class abc
{
public static void main(String s[])
{
Scanner k=new Scanner(System.in);
int n;

System.out.println("Input array size: ");
n=k.nextInt();
int x[]=new int[n];

System.out.println("Input array: ");
for(int i=0;i<x.length;i++)
{
  x[i]=k.nextInt();
}

System.out.println("Array is: ");
for(int i=0;i<x.length;i++)
{
 System.out.println(x[i]);
}

}
}

