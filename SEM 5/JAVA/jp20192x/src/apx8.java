
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class apx8 extends Applet implements ActionListener {
    Button b,b1;
    TextField t1;
    public void init()
    {
        t1=new TextField(20);
        b=new Button("Button1");
        b1=new Button("Reset");
        add(t1);
        add(b);
        add(b1);
        b.addActionListener(this);
        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b)
         t1.setText("Hello World");
        else
         t1.setText(" ");   
    }
    
}
