import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ap13 extends Applet implements KeyListener
{
String s;
public void init()
{
s="";
addKeyListener(this);
}

//we get key char and code
public void keyPressed(KeyEvent e)
{
	
}

//we get key char and code
public void keyReleased(KeyEvent e)
{

}

//we get only key chars
public void keyTyped(KeyEvent e)
{
	int x=e.getKeyCode();
	int y=e.getKeyChar();
	s="Keycode: "+x+",KeyChar: "+y;
	repaint();
}

public void paint(Graphics g)
{
  g.drawString(s,100,100);
}
}