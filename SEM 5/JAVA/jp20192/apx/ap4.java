import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;
public class ap4 extends Applet
{


public void paint(Graphics g)
{
   g.setColor(Color.RED);
   g.fillRect(140,20,120,120);

   g.setColor(Color.GREEN);
   g.fillOval(290,20,100,120);

   g.fillArc(100,200,120,120,0,100);		

   g.fillRoundRect(250,200,120,120,30,30);
}

}