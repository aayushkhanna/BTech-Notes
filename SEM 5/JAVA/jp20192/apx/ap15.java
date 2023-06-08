import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ap15 extends Applet implements KeyListener
{
String s;
public void init()
{
s="";
addKeyListener(this);
}

public void keyPressed(KeyEvent e)
{
}

public void keyReleased(KeyEvent e)
{

}

public void keyTyped(KeyEvent e)
{
 s+=e.getKeyChar();
 repaint();	
}

public void paint(Graphics g)
{
 g.drawString(s,50,100);
}
}