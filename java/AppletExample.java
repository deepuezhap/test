
import java.applet.*;
import java.awt.*;

public class AppletExample extends Applet {
    public void paint(Graphics g) {

        int[] xPoints = {100, 50,150};
        int[] yPoints = {50,100,100};
        int nPoints = 3;
        g.drawLine(100,100,50,50);
        g.drawRect(100,100,50,50);


        g.drawPolygon(xPoints, yPoints, nPoints);




    }
}

