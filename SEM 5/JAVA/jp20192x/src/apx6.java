
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class apx6 extends Applet implements ActionListener {
    Button b;
    public void init()
    {
        b=new Button("Button1");
        add(b);
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setBackground(Color.RED);
    }
    
}
