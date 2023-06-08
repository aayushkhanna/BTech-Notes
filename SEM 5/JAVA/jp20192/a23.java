import java.util.Scanner;

class abc
{
public static void main(String s[])
{
int x[]=new int[7];

Scanner k=new Scanner(System.in);

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

