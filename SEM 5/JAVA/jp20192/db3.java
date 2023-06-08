import java.sql.*;

class db3
{
public static void main(String s[]) throws Exception
{
Class.forName("oracle.jdbc.OracleDriver");
String str="jdbc:oracle:thin:@localhost:1521:";
Connection x=DriverManager.getConnection(str,"jp20192","123456");

String a="101";
String b="raman";
String c="92";

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