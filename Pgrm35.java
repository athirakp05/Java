//to draw line circle and rectangle using applet
import java.applet.*;
import java.awt.*;
public class Pgrm35 extends Applet 
{
	/*public void init()
	{
		// set size
		//setSize(100, 100);

		repaint();
	}
*/
	 int x,y,r;
    public void paint(Graphics g)
    {
		g.setColor(Color.blue);
        g.drawLine(3,300,200,100);
        g.drawString("Line",1000,1000);
        g.drawOval(x-r,y-r,200,200);
        g.drawString("Circle",150,150);
        g.drawRect(300,100,200,150);
        g.drawString("Rectangle",350,200);
   }
}