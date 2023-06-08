
import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class apx12 extends Applet implements ItemListener {
    
    Checkbox c1,c2,c3;
    public void init()
    {
        CheckboxGroup g1=new CheckboxGroup();
        c1=new Checkbox("Red",false,g1);
        c2=new Checkbox("Green",false,g1);
        c3=new Checkbox("Blue",false,g1);
        
        add(c1);
        add(c2);
        add(c3);
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
            if(c1.getState()==true)
            setBackground(Color.RED);
        else if(c2.getState()==true)
            setBackground(Color.GREEN);
        else if(c3.getState()==true)
            setBackground(Color.BLUE);
    }

    
}
