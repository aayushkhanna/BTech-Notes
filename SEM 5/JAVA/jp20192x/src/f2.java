
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class f2 extends Frame  implements WindowListener{
    
    public f2()
    {
        setSize(300,400);
        setTitle("My Frame");
        addWindowListener(this);
    }
   
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
     System.out.println("Closing");
     dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
     System.out.println("Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
     System.out.println("Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
     System.out.println("Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
     System.out.println("Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
     System.out.println("Deactivated");
    }

    
    public static void main(String s[])
    {
        f2 a=new f2();
        a.setVisible(true);
    }
}
