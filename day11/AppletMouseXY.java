import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class AppletMouseXY extends Applet implements MouseMotionListener
{
	int x,y;
	String str="";
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		repaint();
    }
    public void mouseDragged(MouseEvent e)
    {
		x=e.getX();
		y=e.getY();
		repaint();
	}

	public void mouseEntered(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		str="";
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

/*
<Applet code="AppletMouseXY.class" width="700" height="500">
</Applet>
*/