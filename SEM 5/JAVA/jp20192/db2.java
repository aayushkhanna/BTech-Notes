import java.sql.*;

class db2
{
public static void main(String s[]) throws Exception
{
//Establish Connection

//1. Initalize driver
Class.forName("oracle.jdbc.OracleDriver");

//2. Create connection String
String str="jdbc:oracle:thin:@localhost:1521:";


//3. Open connection
Connection x=DriverManager.getConnection(str,"jp20192","123456");

String q="insert into student values(100,'aman',67)";

PreparedStatement y=x.prepareStatement(q);

int n=y.executeUpdate();

System.out.println(n+" data inserted");

y.close();

//close connection
x.close();

}
}