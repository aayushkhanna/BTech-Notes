
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class f3 extends Frame  implements WindowListener,ActionListener{
    
    MenuBar mb;
    Menu m1,m2;
    MenuItem m11,m12,m21;
    
    public f3()
    {
        setSize(300,400);
        setTitle("My Frame");
        m11=new MenuItem("Test1");
        m12=new MenuItem("Exit");
        m21=new MenuItem("Test2");
        
        m1=new Menu("Menu1");
        m2=new Menu("Menu2");
        
        mb=new MenuBar();
        
        m1.add(m11);
        m1.add(m12);
        
        m2.add(m21);
        
        mb.add(m1);
        mb.add(m2);
        
        setMenuBar(mb);
        
        m12.addActionListener(this);
        m11.addActionListener(this);
        addWindowListener(this);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==m12)
         dispose();
     else if(e.getSource()==m11)
     {
         f2 k=new f2();
         k.setVisible(true);
     }    
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
     
     dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
     }

    @Override
    public void windowIconified(WindowEvent e) {
     }

    @Override
    public void windowDeiconified(WindowEvent e) {
     }

    @Override
    public void windowActivated(WindowEvent e) {
     }

    @Override
    public void windowDeactivated(WindowEvent e) {
     }

    
    public static void main(String s[])
    {
        f3 a=new f3();
        a.setVisible(true);
    }

  
}
