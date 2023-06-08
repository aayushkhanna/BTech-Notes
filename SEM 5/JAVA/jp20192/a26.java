import java.util.Scanner;

class abc
{
public static void main(String s[])
{
Scanner k=new Scanner(System.in);
int x[][]=new int[3][5];

System.out.println("Input Array: ");
for(int i=0;i<x.length;i++)
{
  for(int j=0;j<x[i].length;j++)
  {  
	x[i][j]=k.nextInt();
  }
}


System.out.println("2-d array is ");
for(int i=0;i<x.length;i++)
{
  for(int j=0;j<x[i].length;j++)
  {  
	System.out.print(x[i][j]+"\t");
  }

  System.out.println();
}

}
}

