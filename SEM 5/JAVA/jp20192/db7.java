import java.sql.*;
import java.util.*;

class db7
{
public static void main(String s[]) throws Exception
{

Scanner k=new Scanner(System.in);

Class.forName("oracle.jdbc.OracleDriver");
String str="jdbc:oracle:thin:@localhost:1521:";
Connection x=DriverManager.getConnection(str,"jp20192","123456");

String a;

System.out.println("Input roll: ");
a=k.nextLine();

String q="delete from student where rollno=?";

PreparedStatement y=x.prepareStatement(q);

y.setString(1,a);

int n=y.executeUpdate();

System.out.println(n+" data deleted");

y.close();

x.close();

}
}