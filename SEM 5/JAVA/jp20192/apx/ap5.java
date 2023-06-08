import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class ap5 extends Applet
{


public void paint(Graphics g)
{
   g.setColor(Color.RED);

   int x[]={150,250,250,120,70};
   int y[]={20,100,200,200,120};
   g.drawPolygon(x,y,5);	

}

}