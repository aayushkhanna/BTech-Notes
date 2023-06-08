import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

public class apx5 extends Applet{
    Button b1,b2;
            
    public void init()
    {
       
       setSize(400, 500);
        
       b1=new Button("button1");
       b2=new Button("button2");
       
       b1.setBounds(50, 100, 100, 30);
       b2.setBounds(150, 200, 100, 30);
       
       setLayout(null);
       
       add(b1);
       add(b2);
       
    }
}
