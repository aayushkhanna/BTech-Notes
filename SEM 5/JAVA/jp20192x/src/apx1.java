import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;

public class apx1 extends Applet{
    Label z1;
    TextField t1,t2,t3,t4;
    Button b1,b2;
    Checkbox c1,c2,c3;
    Checkbox r1,r2,r3,r4;
    CheckboxGroup g1,g2;
    Choice k1;
    List x1,x2,x3;
    TextArea p1,p2;
            
    public void init()
    {
       z1=new Label("Name");
       
       t1=new TextField();
       t2=new TextField(10);
       t3=new TextField("hello");
       t4=new TextField("hello",20);
       
       b1=new Button();
       b2=new Button("Test Button");
       
       c1=new Checkbox("Hockey");
       c2=new Checkbox("Cricket",true);
       c3=new Checkbox("Surfing",false);
       
       g1=new CheckboxGroup();
       g2=new CheckboxGroup();
       
       r1=new Checkbox("Male",g1,true);
       r2=new Checkbox("Female",g1,false);
       r3=new Checkbox("Married",g2,true);
       r4=new Checkbox("Single",g2,false);
       
       k1=new Choice();
       k1.addItem("India");
       k1.addItem("Japan");
       k1.addItem("USA");
       k1.addItem("UK");
       
       x1=new List();
       x1.addItem("abc");
       x1.addItem("abc1");
       x1.addItem("abc2");
       x1.addItem("abc3");
       x1.addItem("abc4");
       x1.addItem("abc5");
       
       x2=new List(3);
       x2.addItem("abc");
       x2.addItem("abc1");
       x2.addItem("abc2");
       x2.addItem("abc3");
       x2.addItem("abc4");
       x2.addItem("abc5");
       
       x3=new List(5,true);
       x3.addItem("abc");
       x3.addItem("abc1");
       x3.addItem("abc2");
       x3.addItem("abc3");
       x3.addItem("abc4");
       x3.addItem("abc5");
       
       p1=new TextArea();
       p2=new TextArea(6,10);
       
       
       add(z1);
       add(t1);
       add(t2);
       add(t3);
       add(t4);
       
       add(b1);
       add(b2);
       
       add(c1);
       add(c2);
       add(c3);
       
       add(r1);
       add(r2);
       add(r3);
       add(r4);
       
       add(k1);
       add(x1);
       add(x2);
       add(x3);
       
       add(p1);
       add(p2);
    }
}
