import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ap12 extends Applet implements KeyListener
{

public void init()
{
addKeyListener(this);
}

public void keyPressed(KeyEvent e)
{
  setBackground(Color.RED);
}

public void keyReleased(KeyEvent e)
{
  setBackground(Color.YELLOW);
}

public void keyTyped(KeyEvent e)
{

}

public void paint(Graphics g)
{

}
}