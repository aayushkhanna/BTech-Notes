import java.sql.*;
import java.util.*;

class db5
{
public static void main(String s[]) throws Exception
{

Scanner k=new Scanner(System.in);

Class.forName("oracle.jdbc.OracleDriver");
String str="jdbc:oracle:thin:@localhost:1521:";
Connection x=DriverManager.getConnection(str,"jp20192","123456");

String a,b,c;

System.out.println("Input roll: ");
a=k.nextLine();

System.out.println("Input name: ");
b=k.nextLine();

System.out.println("Input marks: ");
c=k.nextLine();

String q="insert into student values(?,?,?)";

PreparedStatement y=x.prepareStatement(q);

y.setString(1,a);
y.setString(2,b);
y.setString(3,c);

int n=y.executeUpdate();

System.out.println(n+" data inserted");

y.close();

x.close();

}
}