
import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class apx10 extends Applet implements ActionListener {
    Button b;
    Checkbox c1,c2,c3;
    public void init()
    {
        CheckboxGroup g1=new CheckboxGroup();
        c1=new Checkbox("Red",true,g1);
        c2=new Checkbox("Green",false,g1);
        c3=new Checkbox("Blue",false,g1);
        
        b=new Button("Change Color");
        add(c1);
        add(c2);
        add(c3);
        add(b);
        
        b.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(c1.getState()==true)
            setBackground(Color.RED);
        else if(c2.getState()==true)
            setBackground(Color.GREEN);
        else if(c3.getState()==true)
            setBackground(Color.BLUE);
    }
    
}
