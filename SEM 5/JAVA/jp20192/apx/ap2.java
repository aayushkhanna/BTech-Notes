import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;
public class ap2 extends Applet
{

public void init()
{
 setBackground(Color.YELLOW);
}

public void paint(Graphics g)
{
  g.drawString("Hello",50,100);

  g.setColor(Color.RED);
  g.drawString("Hello1",150,200);

  Color c=new Color(200,140,255);
  g.setColor(c);
  g.drawString("Hello2",250,200);

  Font f=new Font("arial",Font.BOLD+Font.ITALIC,30);
  g.setFont(f);
  g.drawString("Hello3",250,300);
	
}

}