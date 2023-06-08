import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class db9 extends JFrame implements ActionListener
{
JLabel k1,k2,k3;
JTextField t1,t2,t3;
JButton b1;

public db9()
{
setSize(300,500);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

k1=new JLabel("Roll No");
k2=new JLabel("Name");
k3=new JLabel("Marks");

t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);

b1=new JButton("Save");

add(k1);
add(t1);

add(k2);
add(t2);

add(k3);
add(t3);

add(b1);

b1.addActionListener(this);

setLayout(new FlowLayout());
}

public void actionPerformed(ActionEvent e)
{

try
{
String name,rollno,marks;
rollno=t1.getText();
name=t2.getText();
marks=t3.getText();

if(rollno.trim().length()==0)
{
JOptionPane.showMessageDialog(this,"Roll Number cannot be empty");
return;
}

if(name.trim().length()==0)
{
JOptionPane.showMessageDialog(this,"Name cannot be empty");
return;
}

if(marks.trim().length()==0)
{
JOptionPane.showMessageDialog(this,"Marks cannot be empty");
return;
}

Class.forName("oracle.jdbc.OracleDriver");
String str="jdbc:oracle:thin:@localhost:1521:";
Connection x=DriverManager.getConnection(str,"jp20192","123456");

String q="insert into student values(?,?,?)";

PreparedStatement y=x.prepareStatement(q);

y.setString(1,rollno);
y.setString(2,name);
y.setString(3,marks);

int n=y.executeUpdate();
String d=n+" data inserted";


y.close();

x.close();

JOptionPane.showMessageDialog(this,d);

t1.setText("");
t2.setText("");
t3.setText("");

}
catch(Exception ex)
{
JOptionPane.showMessageDialog(this,"Error "+ex.getMessage());

ex.printStackTrace();
}	
}

public static void main(String s[]) {

db9 a=new db9();
a.setVisible(true);

}
}