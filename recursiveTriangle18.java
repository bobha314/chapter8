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
   private int[] xPos = {720, 80, 400, 720};
   private int[] yPos = {600, 600, 40, 600};


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
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
        //Find the distance between 2 points ex. - x,y & x1,y1
        double distance = Math.sqrt(Math.pow((xPos[0]-xPos[0]),2) + Math.pow((yPos[0]-yPos[0]),2));
       
        

        //if the segment/distance is 30 or so, good length to stop
        
        if (distance <= 30)
        {
            return;
        }
        
        //{
            //find the mid points of each line segment


            //make the x and y array (3 points + first point to finish triangle)
        else
        {
            int[] xNew = {(xPos[0]+xPos[1])/2, (xPos[1]+xPos[2])/2, (xPos[2]+xPos[0])/2, (xPos[0]+xPos[1])/2};
            int[] yNew = {(yPos[0]+yPos[1])/2, (yPos[1]+yPos[2])/2, (yPos[2]+yPos[0])/2, (yPos[0]+yPos[1])/2}; 

            //draw the Triangle
            page.setColor (Color.blue);
            page.drawPolyline (xNew, yNew, xNew.length);

            //create x,y Array using the midpoints you calculated
            /*
            int xArray[] = new xArray[4];
            int yArray[] = new yArray[4];
            
            for(int i = 0; i < xNew.length; i++)
            {
                xArray[i] = xNew[i]
                */


            // Recursive calls for each section of triangle
            Triangle(xNew, yNew, page);
        }


        //}



   }//end of Triangle
}
