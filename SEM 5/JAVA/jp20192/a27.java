class abc
{
public static void main(String s[])
{
int x[][]={{10,2,3,4},{2,7,8,10},{5,4,8,7}};

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

