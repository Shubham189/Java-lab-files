import java.applet.*;
import java.awt.*;

public class smile extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(60,60,200,200);
		g.setColor(Color.black);
		g.fillOval(100,120,30,30);
		g.fillOval(190,120,30,30);

		g.drawOval(59,59,202,202);
		g.drawLine(160,140,160,185);
		g.drawArc(110,130,95,95,0,-180);
	}
}
