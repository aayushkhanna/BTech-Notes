
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class main1 extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu m1;
    JMenuItem k1;
    JMenuItem k2;
    
    JDesktopPane d1;
    
    public main1()
    {
        setSize(600,600);
        
        m1=new JMenu("Menu");
        k1=new JMenuItem("Item1");
        k2=new JMenuItem("Item2");
        m1.add(k1);
        m1.add(k2);
        
        mb=new JMenuBar();
        mb.add(m1);
        
        d1=new JDesktopPane();
        d1.setSize(600,600);
        
        add(d1);
        
        k1.addActionListener(this);
        k2.addActionListener(this);
        
        setJMenuBar(mb);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==k1)
    {
        inner1 p1=new inner1();
        d1.add(p1);
        p1.setVisible(true);
    }
    else
    {
        inner2 p2=new inner2();
        d1.add(p2);
        p2.setVisible(true);
    }
    
    }
    
    public static void main(String s[])
    {
        main1 x=new main1();
        x.setVisible(true);
    }

    
}
