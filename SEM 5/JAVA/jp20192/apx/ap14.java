import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ap14 extends Applet implements KeyListener
{
public void init()
{
addKeyListener(this);
}

public void keyPressed(KeyEvent e)
{
int x=e.getKeyCode();
if(x==KeyEvent.VK_R)
 setBackground(Color.RED);
else if(x==KeyEvent.VK_G)
 setBackground(Color.GREEN);
else if(x==KeyEvent.VK_F1)
 setBackground(Color.YELLOW);
else if(x==KeyEvent.VK_DELETE)
 setBackground(Color.WHITE);

}

public void keyReleased(KeyEvent e)
{

}

public void keyTyped(KeyEvent e)
{
}

public void paint(Graphics g)
{
}
}