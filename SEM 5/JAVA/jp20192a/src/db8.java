import java.sql.*;

class db8
{
public static void main(String s[]) throws Exception
{


Class.forName("oracle.jdbc.OracleDriver");
String str="jdbc:oracle:thin:@localhost:1521:";
Connection x=DriverManager.getConnection(str,"jp20192","123456");


String q="select * from student";

PreparedStatement y=x.prepareStatement(q);

ResultSet rs=y.executeQuery();

String a,b,c;

while(rs.next())
{
a=rs.getString("rollno");
b=rs.getString("name");
c=rs.getString("marks");

System.out.println(a+","+b+","+c);
}

y.close();

x.close();

}
}