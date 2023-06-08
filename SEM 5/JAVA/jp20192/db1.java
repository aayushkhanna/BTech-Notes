import java.sql.*;

class db1
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


System.out.println("Connection established");


//close connection
x.close();

}
}