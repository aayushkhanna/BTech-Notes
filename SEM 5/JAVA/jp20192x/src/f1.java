
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class f1 extends Frame implements ActionListener {
    
    Button b1,b2;
    public f1()
    {
        setSize(300,400);
        setTitle("My Frame");
        setLayout(new FlowLayout());
        b1=new Button("Hide");
        b2=new Button("Close");
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2)
         dispose();
        else
         setVisible(false);   
    }

    
    public static void main(String s[])
    {
        f1 a=new f1();
        a.setVisible(true);
    }

}
