import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ap8 extends Applet implements MouseListener,MouseMotionListener
{
int x1,y1,x2,y2;
public void init()
{
	addMouseListener(this); //V.Imp.
	addMouseMotionListener(this); //V.Imp.
}

public void mouseClicked(MouseEvent e)
{
}


public void mouseReleased(MouseEvent e)
{
}

public void mouseEntered(MouseEvent e)
{
}

public void mouseExited(MouseEvent e)
{
}

public void mouseMoved(MouseEvent e)
{
}

public void mousePressed(MouseEvent e)
{
x1=e.getX();
y1=e.getY();
x2=x1;
y2=y1;
repaint();
}

public void mouseDragged(MouseEvent e)
{
x2=e.getX();
y2=e.getY();
repaint(); 
}

public void paint(Graphics g)
{
 g.drawLine(x1,y1,x2,y2);
}
}