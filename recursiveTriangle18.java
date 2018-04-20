import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

   /*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle
   */
   private int[] xPosog = {720, 80, 400, 720};
   private int[] yPosog = {600, 600, 40, 600};
   
   private double distance;


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor (Color.red);
        page.drawPolyline (xPosog, yPosog, xPosog.length);

        Triangle(xPosog,yPosog,page);
        
    
        //draw the Triangle
   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {   
        //Find the distance between 2 points ex. - x,y & x1,y1
        double distance = Math.sqrt((Math.pow((xPos[0]-xPos[1]),2) + Math.pow((yPos[0]-yPos[1]),2)));      
        
        

        //if the segment/distance is 30 or so, good length to stop
        
        if (distance < 30)
        {
            return;
        }
        
        else 
        {
            int[] xMid = {(xPos[0]+xPos[1])/2, (xPos[1]+xPos[2])/2, (xPos[2]+xPos[0])/2, (xPos[0]+xPos[1])/2};
            int[] yMid = {(yPos[0]+yPos[1])/2, (yPos[1]+yPos[2])/2, (yPos[2]+yPos[0])/2, (yPos[0]+yPos[1])/2};
            
            page.drawPolyline (xMid, yMid, xMid.length);
            
            int[] xNew1 = {xPos[0], xMid[0], xMid[2], xPos[0]};
            int[] yNew1 = {yPos[0], yMid[0], yMid[2], yPos[0]}; 
           
            int[] xNew2 = {xPos[1], xMid[1], xMid[0], xPos[1]};
            int[] yNew2 = {yPos[1], yMid[1], yMid[0], yPos[1]};  
            
            int[] xNew3 = {xPos[2], xMid[2], xMid[1], xPos[2]};
            int[] yNew3 = {yPos[2], yMid[2], yMid[1], yPos[2]}; 

            //draw the Triangle
            page.setColor (Color.blue);
            
            Triangle(xNew1, yNew1, page);
            Triangle(xNew2, yNew2, page);
            Triangle(xNew3, yNew3, page);
        }   
   }//end of Triangle  
}







