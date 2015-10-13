
import java.awt.*;
import javax.swing.*;

public class Face extends JApplet
{
   private final int X = 150;
   private final int Y = 100;
   private final int X2 = 110;
   private final int Y2 = 60;
 
   public void paint (Graphics page)
{
   setBackground (Color.blue);
   page.setColor (Color.yellow);
   page.drawOval (X-40, Y-40, 80, 80);
   page.drawOval (X2+20, Y2+30, 15, 7);
   page.drawOval (X2+45, Y2+30, 15, 7);
   page.fillOval (X2+25, Y2+31, 5, 5);
   page.fillOval (X2+50, Y2+31, 5, 5);
   page.drawArc (X2-8, Y2+35, 16, 15, 90, 180);  
   page.drawArc (X2+72, Y2+35, 16, 15, 90, -180); 
   page.drawArc (X2+35, Y2+40, 15, 10, 180, 180);  
   page.drawArc (X2+20, Y2+50, 40, 15, 180, 180);  
} 
}


