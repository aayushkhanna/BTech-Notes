
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class db9 extends JFrame implements ActionListener,MouseListener {

    JLabel k1, k2, k3;
    JTextField t1, t2, t3;
    JButton b1,b2,b3;
    JTable n1;

    public db9() {
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        n1=new JTable();
        
        k1 = new JLabel("Roll No");
        k2 = new JLabel("Name");
        k3 = new JLabel("Marks");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);

        b1 = new JButton("Save");
        b2 = new JButton("Modify");
        b3 = new JButton("Delete");

        JScrollPane sp=new JScrollPane(n1);
        
        add(k1);
        add(t1);

        add(k2);
        add(t2);

        add(k3);
        add(t3);

        add(b1);
        add(b2);
        add(b3);
        
        add(sp);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        n1.addMouseListener(this);
        setLayout(new FlowLayout());
        showData();
    }

    void showData() {

        try {
            
            Vector h=new Vector();
            h.add("Roll");
            h.add("Name");
            h.add("Marks");
            
            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "jp20192", "123456");
            String q = "select * from student";
            PreparedStatement y = x.prepareStatement(q);
            ResultSet rs = y.executeQuery();
            
            Vector d=new Vector(); 
            
            String a, b, c;
            while (rs.next()) {
                a = rs.getString("rollno");
                b = rs.getString("name");
                c = rs.getString("marks");
                Vector r=new Vector();
                r.add(a);
                r.add(b);
                r.add(c);
                //inserted into data
                d.add(r);
            }
            y.close();
            x.close();
            
            DefaultTableModel z= new DefaultTableModel(d,h);
            n1.setModel(z);
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
            ex.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            saveData();
        }
        else if(e.getSource()==b2)
        {
            modifyData();
        }
        else if(e.getSource()==b3)
        {
            deleteData();
        }
        
    }

    void saveData()
    {
        try {
            String name, rollno, marks;
            rollno = t1.getText();
            name = t2.getText();
            marks = t3.getText();

            if (rollno.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Roll Number cannot be empty");
                return;
            }

            if (name.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Name cannot be empty");
                return;
            }

            if (marks.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Marks cannot be empty");
                return;
            }

            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "jp20192", "123456");

            String q = "insert into student values(?,?,?)";

            PreparedStatement y = x.prepareStatement(q);

            y.setString(1, rollno);
            y.setString(2, name);
            y.setString(3, marks);

            int n = y.executeUpdate();
            String d = n + " data inserted";

            y.close();

            x.close();

            JOptionPane.showMessageDialog(this, d);

            t1.setText("");
            t2.setText("");
            t3.setText("");
            
            showData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());

            ex.printStackTrace();
        }
    }
    
    void modifyData()
    {
        try {
            String name, rollno, marks;
            rollno = t1.getText();
            name = t2.getText();
            marks = t3.getText();

            if (rollno.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Roll Number cannot be empty");
                return;
            }

            if (name.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Name cannot be empty");
                return;
            }

            if (marks.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Marks cannot be empty");
                return;
            }

            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "jp20192", "123456");

            String q = "update student set name=?,marks=? where rollno=?";

            PreparedStatement y = x.prepareStatement(q);

            y.setString(3, rollno);
            y.setString(1, name);
            y.setString(2, marks);

            int n = y.executeUpdate();
            String d = n + " data updated";

            y.close();

            x.close();

            JOptionPane.showMessageDialog(this, d);

                        
            showData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());

            ex.printStackTrace();
        }
    }
    
    void deleteData()
    {
        try {
            String rollno;
            rollno = t1.getText();
            
            if (rollno.trim().length() == 0) {
                JOptionPane.showMessageDialog(this, "Roll Number cannot be empty");
                return;
            }

            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "jp20192", "123456");

            String q = "delete from student where rollno=?";

            PreparedStatement y = x.prepareStatement(q);

            y.setString(1, rollno);
            
            int n = y.executeUpdate();
            String d = n + " data deleted";

            y.close();

            x.close();

            JOptionPane.showMessageDialog(this, d);

                        
            showData();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());

            ex.printStackTrace();
        }
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        int row=n1.getSelectedRow();
        TableModel k1=n1.getModel();
        String a=(String)k1.getValueAt(row, 0);
        String b=(String)k1.getValueAt(row, 1);
        String c=(String)k1.getValueAt(row, 2);
        t1.setText(a);
        t2.setText(b);
        t3.setText(c);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String s[]) {

        db9 a = new db9();
        a.setVisible(true);

    }

}
