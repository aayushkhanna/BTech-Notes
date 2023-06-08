import java.sql.*;

class db4
{
public static void main(String s[]) throws Exception
{
Class.forName("oracle.jdbc.OracleDriver");
String str="jdbc:oracle:thin:@localhost:1521:";
Connection x=DriverManager.getConnection(str,"jp20192","123456");

String a=s[0];
String b=s[1];
String c=s[2];

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