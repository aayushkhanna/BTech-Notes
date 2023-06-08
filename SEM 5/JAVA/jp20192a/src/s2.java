
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class s2 extends JFrame {
    public s2()
    {
        setSize(600,400);
        setTitle("My Frame");
        JButton b[]=new JButton[600];
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(60,10));
        for(int i=0;i<b.length;i++)
        {
            b[i]=new JButton("Button"+(i+1));
            p.add(b[i]);
        }
        
        JScrollPane k=new JScrollPane(p);
        //JScrollPane k=new JScrollPane(p,JScrollPane.VERTICAL_SCROLLBAR_NEVER,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        add(k);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    public static void main(String s[])
    {
        s2 a=new s2();
        a.setVisible(true);
    }
}
