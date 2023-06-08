import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;

public class apx2 extends Applet{
    Button b1,b2,b3,b4,b5,b6;
            
    public void init()
    {
       
       b1=new Button("button1");
       b2=new Button("button2");
       b3=new Button("button3");
       b4=new Button("button4");
       b5=new Button("button5");
       b6=new Button("button6");
       
       FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
       setLayout(f1);
       
       add(b1);
       add(b2);
       add(b3);
       add(b4);
       add(b5);
       add(b6);
       
    }
}
