
import java.awt.Color;
import javax.swing.*;

public class s1 extends JFrame {
    JLabel k;
    JTextField t1;
    JPasswordField n1;
    JButton b1;
    JCheckBox c1,c2;
    JRadioButton r1,r2,r3,r4;
    JTextArea ta;
    JComboBox x1;
    JList z1;
    JPanel p1;
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem m11,m12,m21;
   
    public s1()
    {
        setSize(300,400);
        setTitle("My JFrame");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
        p1=new JPanel();
        k=new JLabel("Name");
        t1=new JTextField(20);
        n1=new JPasswordField(20);
        c1=new JCheckBox("Hockey");
        c2=new JCheckBox("Cricket");
        r1=new JRadioButton("Male",true);
        r2=new JRadioButton("Female");
        r3=new JRadioButton("Married",true);
        r4=new JRadioButton("Single");
        
        ButtonGroup g1=new ButtonGroup();
        ButtonGroup g2=new ButtonGroup();
        
        g1.add(r1);
        g1.add(r2);
        g2.add(r3);
        g2.add(r4);
        
        x1=new JComboBox();
        x1.addItem("India");
        x1.addItem("China");
        x1.addItem("USA");
        
        String d[]={"Punjab","HP","Delhi","MS"};
        z1=new JList(d);
        
        ta=new JTextArea(6,10);
        
        p1.add(k);
        p1.add(t1);
        p1.add(n1);
        p1.add(c1);
        p1.add(c2);
        p1.add(r1);
        p1.add(r2);
        p1.add(r3);
        p1.add(r4);
        p1.add(x1);
        p1.add(z1);
        p1.add(ta);
        
        add(p1);
        
        m11=new JMenuItem("Test1");
        m12=new JMenuItem("Exit");
        m21=new JMenuItem("Test2");
        
        m1=new JMenu("Menu1");
        m11.setForeground(Color.red);
        m2=new JMenu("Menu2");
        
        mb=new JMenuBar();
        
        m1.add(m11);
        m1.add(m12);
        
        m2.add(m21);
        
        mb.add(m1);
        mb.add(m2);
        
        setJMenuBar(mb);
   
        
    }
    
    public static void main(String s[])
    {
        s1 a=new s1();
        a.setVisible(true);
    }
}
