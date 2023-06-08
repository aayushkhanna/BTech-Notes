class test
{
public static void main(String s[])
{
abc t1=new abc();
xyz t2=new xyz();
abc t3=t2;//OK

t3.show();//C

//t3.display();//error
}
}

//All functions in Java are by default virtual. So super class reference will always call sub class overriding function.