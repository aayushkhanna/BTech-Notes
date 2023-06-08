
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class apx7 extends Applet implements ActionListener {
    Button b1,b2;
    public void init()
    {
        b1=new Button("Button1");
        b2=new Button("Button2");
        
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)        
        setBackground(Color.RED);
        else  if(e.getSource()==b2)        
        setBackground(Color.GREEN);
       
            
    }
    
}
