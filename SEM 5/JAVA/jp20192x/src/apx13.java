
import java.applet.Applet;
import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class apx13 extends Applet implements ItemListener{
    Choice c1;
    public void init()
    {
        c1=new Choice();
        c1.addItem("Select Color");
        c1.addItem("Red");
        c1.addItem("Green");
        c1.addItem("Blue");
        
        add(c1);
        
        c1.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        int n=c1.getSelectedIndex();
        if(n==1)
            setBackground(Color.RED);
        else if(n==2)
            setBackground(Color.GREEN);
        else if(n==3)
            setBackground(Color.BLUE);
        else
            setBackground(Color.WHITE);
    }

    
    
}
