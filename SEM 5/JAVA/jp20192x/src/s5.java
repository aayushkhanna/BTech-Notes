
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class s5 extends JFrame {
    JTable t;
    public s5()
    {
        setSize(600,400);
        setTitle("My Frame");
        
        Vector h=new Vector();
        h.add("Roll");
        h.add("Name");
        h.add("Marks");
        
        Vector d=new Vector();
        
        Vector d1=new Vector();
        d1.add("100");
        d1.add("Aman");
        d1.add("50");
        
        Vector d2=new Vector();
        d2.add("200");
        d2.add("Raman");
        d2.add("20");
        
        Vector d3=new Vector();
        d3.add("300");
        d3.add("Amandeep");
        d3.add("53");
        
        d.add(d1);
        d.add(d2);
        d.add(d3);
        
        t=new JTable(d,h);
        
        JScrollPane p=new JScrollPane(t);
        
        add(p);
        
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    public static void main(String s[])
    {
        s5 a=new s5();
        a.setVisible(true);
    }
}
