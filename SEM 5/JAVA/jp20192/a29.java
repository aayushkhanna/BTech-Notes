class abc
{
public static void main(String s[])
{
int x[][]={{10,2,3,4},{5,8,2,9},{11,7,8,2},{10,4,3,7}};

int i,j,t;

for(i=0;i<x.length-1;i++)
{
  for(j=i+1;j<x[i].length;j++)
  {
		t=x[i][j];
		x[i][j]=x[j][i];
		x[j][i]=t;
  }
}

for(i=0;i<x.length;i++)
{
  for(j=0;j<x[i].length;j++)
  {
	System.out.print(x[i][j]+"\t");
  }

  System.out.println();
}

}
}