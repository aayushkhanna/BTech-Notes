
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class s4 extends JFrame {
    JTable t;
    public s4()
    {
        setSize(600,400);
        setTitle("My Frame");
        
        String h[]={"Roll","Name","Marks"};
        String d[][]={{"100","Aman","50"},{"101","Aman1","52"},{"200","Raman","60"}};
        
        t=new JTable(d,h);
        
        JScrollPane p=new JScrollPane(t);
        
        add(p);
        
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    public static void main(String s[])
    {
        s4 a=new s4();
        a.setVisible(true);
    }
}
