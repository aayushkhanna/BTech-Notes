
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class s3 extends JFrame {

    JTextField t1;
    JButton b1,b2,b3;
    JCheckBox c1;
    JComboBox k1;
    
    public s3()
    {
        setSize(600,400);
        setTitle("My Frame");
        
        t1=new JTextField(20);
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        c1=new JCheckBox("Test");
        k1=new JComboBox();
        k1.addItem("Item1");
        k1.addItem("Item2");
        k1.addItem("Item3");
        
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        
        p1.add(t1);
        p1.add(b1);
        p2.add(c1);
        p2.add(b2);
        p3.add(k1);
        p3.add(b3);
        
        JTabbedPane t=new JTabbedPane();
        t.addTab("Personal", p1);
        t.addTab("Academics", p2);
        t.addTab("Prof", p3);
        
        
        add(t);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    public static void main(String s[])
    {
        s3 a=new s3();
        a.setVisible(true);
    }
}
