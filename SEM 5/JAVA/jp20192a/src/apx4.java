import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;

public class apx4 extends Applet{
    Button b1,b2,b3,b4,b5,b6,b7;
            
    public void init()
    {
       
       b1=new Button("button1");
       b2=new Button("button2");
       b3=new Button("button3");
       b4=new Button("button4");
       b5=new Button("button5");
       b6=new Button("button6");
       b7=new Button("button7");
       
       Panel p1=new Panel();
       
       GridLayout f1=new GridLayout(3,2);
       setLayout(f1);
       
       p1.add(b6);
       p1.add(b7);
       
       add(b1);
       add(b2);
       add(b3);
       add(b4);
       add(b5);
       add(p1);
       
    }
}
