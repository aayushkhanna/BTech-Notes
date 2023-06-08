
package javaapplication1;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class jp28619 extends JFrame implements ActionListener,MouseListener {
    
    JTextField t1,t2,t3;
        JLabel l1,l2,l3;
        JButton b1,b2,b3;
        JTable j1;
        String a,b,c;
        
        
        public jp28619()
                {
                    setSize(300,500);
                    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    setLayout(new FlowLayout());
                    t1=new JTextField(20);
                t2=new JTextField(20);
                t3=new JTextField(20);
                
                l1=new JLabel("Rollno");
                l2=new JLabel("Name");
                l3=new JLabel("Marks");
                
                b1=new JButton("Save");
                b2=new JButton("Modify");
                b3=new JButton("Delete");
                
                j1=new JTable();
                
                JScrollPane sp=new JScrollPane(j1);
                
                
                add(l1);
                add(t1);
                add(l2);
                add(t2);
                add(l3);
                add(t3);
                add(b1);
                add(b2);
                add(b3);
                add(sp);
                
                
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                j1.addMouseListener(this);
                showData();
                }
                
        
        void showData() {

        try {
            
            Vector h=new Vector();
            h.add("Rollno");
            h.add("Name");
            h.add("Marks");
            
            Class.forName("oracle.jdbc.OracleDriver");
            String str = "jdbc:oracle:thin:@localhost:1521:";
            Connection x = DriverManager.getConnection(str, "uday", "12345");
            String q = "select * from student";
            PreparedStatement y = x.prepareStatement(q);
            ResultSet rs = y.executeQuery();
            
            Vector d=new Vector(); 
            
            String rollno, name, marks;
            while (rs.next()) {
                rollno = rs.getString("rollno");
                name = rs.getString("name");
                marks = rs.getString("marks");
                
                Vector r=new Vector();
                r.add(rollno);
                r.add(name);
                r.add(marks);
                d.add(r);
            }
            y.close();
            x.close();
            
            DefaultTableModel z= new DefaultTableModel(d,h);
            j1.setModel(z);
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
            ex.printStackTrace();
        }

    }

       

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
            savedata();
         if(e.getSource()==b2)
            modifyData();
          if(e.getSource()==b3)
            deleteData();
        
    }
    
        void savedata() 
        {try 
        {String name,rollno,marks;
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
            Connection x=DriverManager.getConnection(str,"uday","12345");
            String q="Insert into student values(?,?,?)";
            PreparedStatement y=x.prepareStatement(q);
            y.setString(1,rollno);
            y.setString(2,name);
            y.setString(3,marks);
            
            int n=y.executeUpdate();
            String d=n+" data inserted";
            y.close();
            x.close();
            JOptionPane.showMessageDialog(this,d);
               clear();
        showData();
        }
            
         catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Error "+ex.getMessage());
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
            Connection x = DriverManager.getConnection(str, "uday", "12345");

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
            
            clear();
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
            Connection x = DriverManager.getConnection(str, "uday", "12345");

            String q = "delete from student where rollno=?";

            PreparedStatement y = x.prepareStatement(q);

            y.setString(1, rollno);
            
            int n = y.executeUpdate();
            String d = n + " data deleted";

            y.close();

            x.close();

            JOptionPane.showMessageDialog(this, d);
            clear();
            showData();

        

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());

            ex.printStackTrace();
        }
    }
     
     void clear()
     {
         t1.setText("");
         t2.setText("");
         t3.setText("");
     }

    @Override
    public void mouseClicked(MouseEvent e) {
         int row=j1.getSelectedRow();
        TableModel k1=j1.getModel();
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
     
     
     
           

       
    public static void main(String s[]) throws Exception
    {
     jp28619 jp=new jp28619();
     jp.setVisible(true);
    }
    
    
}
  

  