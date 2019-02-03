import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class AppletMouseXY extends Applet implements MouseListener, MouseMotionListener
{
	int x,y;
	String str="";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseEntered(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.fillOval(x,y,10,10);
		String str="X:"+x+" Y:"+y;
		g.drawString(str,x+10,y-10);
		showStatus("mouse moved to "+x+":"+y);
	}
}
