import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;
public class ap3 extends Applet
{


public void paint(Graphics g)
{
   g.setColor(Color.RED);
   g.drawLine(20,20,100,120);

   g.drawRect(140,20,120,120);

   g.setColor(Color.GREEN);
   g.drawOval(290,20,100,120);

   g.drawArc(100,200,120,120,0,100);		

   g.drawRoundRect(250,200,120,120,30,30);
}

}