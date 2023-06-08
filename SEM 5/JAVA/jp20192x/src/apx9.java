
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class apx9 extends Applet implements ActionListener {
    Button b;
    TextField t1,t2;
    public void init()
    {
        t1=new TextField(20);
        t2=new TextField(20);
        b=new Button("Button1");
        add(t1);
        add(t2);
        add(b);
        
        b.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           String k=t1.getText();
           t2.setText(k);
    }
    
}
