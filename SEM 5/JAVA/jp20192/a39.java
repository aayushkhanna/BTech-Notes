import java.util.Scanner;

class student
{
String name;
int roll;
float marks;

student()
{
name="amandeep";
roll=900;
marks=67.2f;
}

student(int a,String b,float c)
{
roll=a;
name=b;
marks=c;
}

void input()
{
Scanner k1=new Scanner(System.in);
Scanner k2=new Scanner(System.in);

System.out.println("Input name: ");
name=k1.nextLine();

System.out.println("Input roll no: ");
roll=k2.nextInt();

System.out.println("Input marks: ");
marks=k2.nextFloat();
}

void show()
{
System.out.println(roll+","+name+","+marks);
}


}