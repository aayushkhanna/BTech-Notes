import java.applet.Applet;
import java.awt.Graphics;

public class ap1 extends Applet
{

public void init()
{
 System.out.println("Init called");
}

public void start()
{
 System.out.println("Start called");
}

public void paint(Graphics g)
{
 System.out.println("Paint called");
}

public void stop()
{
 System.out.println("Stop called");
}

public void destroy()
{
 System.out.println("Destroy called");
}
}