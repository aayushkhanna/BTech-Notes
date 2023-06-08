
import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class apx11 extends Applet implements ActionListener {
    Button b;
    Choice c1;
    public void init()
    {
        c1=new Choice();
        c1.addItem("Red");
        c1.addItem("Green");
        c1.addItem("Blue");
        
        b=new Button("Change");
        add(c1);
        add(b);
        
        b.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n=c1.getSelectedIndex();
        if(n==0)
            setBackground(Color.RED);
        else if(n==1)
            setBackground(Color.GREEN);
        else if(n==2)
            setBackground(Color.BLUE);
        
    }
    
}
