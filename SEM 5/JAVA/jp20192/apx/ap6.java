import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ap6 extends Applet implements MouseListener
{
public void init()
{
	addMouseListener(this); //V.Imp.
}

public void mouseClicked(MouseEvent e)
{
	setBackground(Color.BLACK);
}

public void mousePressed(MouseEvent e)
{
	setBackground(Color.RED);
}

public void mouseReleased(MouseEvent e)
{
	setBackground(Color.YELLOW);
}

public void mouseEntered(MouseEvent e)
{
	setBackground(Color.BLUE);
}

public void mouseExited(MouseEvent e)
{
	setBackground(Color.GREEN);
}

}