import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ap7 extends Applet implements MouseListener,MouseMotionListener
{
String s;
int x=10,y=10;
public void init()
{
	s="Init called";
	addMouseListener(this); //V.Imp.
	addMouseMotionListener(this); //V.Imp.
}

public void mouseClicked(MouseEvent e)
{
	x=e.getX();
	y=e.getY();
	s="Mouse Clicked at "+x+","+y;
	repaint();
}

public void mousePressed(MouseEvent e)
{
	x=e.getX();
	y=e.getY();
	s="Mouse Pressed at "+x+","+y;
	repaint();
}

public void mouseReleased(MouseEvent e)
{
	x=e.getX();
	y=e.getY();
	s="Mouse Released at "+x+","+y;
	repaint();
}

public void mouseEntered(MouseEvent e)
{
	x=e.getX();
	y=e.getY();
	s="Mouse Entered at "+x+","+y;
	repaint();
}

public void mouseExited(MouseEvent e)
{
	x=e.getX();
	y=e.getY();
	s="Mouse Exited at "+x+","+y;
	repaint();
}

public void mouseMoved(MouseEvent e)
{
	x=e.getX();
	y=e.getY();
	s="Mouse Moved at "+x+","+y;
	repaint();
}

public void mouseDragged(MouseEvent e)
{
	x=e.getX();
	y=e.getY();
	s="Mouse Dragged at "+x+","+y;
	repaint();
}

public void paint(Graphics g)
{
	g.drawString(s,x,y);
}
}