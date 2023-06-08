import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

public class apx3 extends Applet{
    Button b1,b2,b3,b4,b5,b6;
            
    public void init()
    {
       
       b1=new Button("button1");
       b2=new Button("button2");
       b3=new Button("button3");
       b4=new Button("button4");
       b5=new Button("button5");
       b6=new Button("button6");
       
       BorderLayout f1=new BorderLayout();
       setLayout(f1);
       
       FlowLayout f2=new FlowLayout(FlowLayout.LEFT);
       Panel p1=new Panel(f2);
       p1.setBackground(Color.RED);
       p1.add(b1);
       p1.add(b2);
       
       
       add(p1,BorderLayout.NORTH);
       add(b3,BorderLayout.WEST);
       add(b4,BorderLayout.EAST);
       add(b5,BorderLayout.SOUTH);
       add(b6,BorderLayout.CENTER);
       
    }
}
