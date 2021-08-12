/*
 * Molita Nuon
 * CS A170
 * May 8, 2017
 * 
 * Exercise #28
 */
import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class Snowman extends JApplet
{
   
    
    public void paint (Graphics canvas)
    {
       //background
       canvas.setColor(Color.BLUE);
       canvas.fillRect(0,0,getWidth(), getHeight());
        //Draw ground:
       canvas.setColor(Color.DARK_GRAY);
       canvas.fillRect(0, 400, getWidth(), getHeight());
        //Draw sun:
       canvas.setColor(Color.YELLOW);
       canvas.fillOval(10,10, 100, 100); 
       //Draw body:
       canvas.setColor(Color.WHITE);
       canvas.fillOval(250, 325, 150, 110); // bottom
       canvas.fillOval(265, 270, 120, 90); // middle
       canvas.fillOval(285, 220, 85, 70); //top
       //Draw arms
       canvas.setColor(Color.BLACK);
       canvas.drawLine(290, 300, 200, 300); // left hand
       canvas.drawLine(430, 300, 360, 300); // right hand
       //Draw face
       canvas.drawArc(350, 240, 10, 10, 0, -180); // right eye
       canvas.drawArc(325, 240, 10, 10, 0, -180); // left eye
       canvas.drawArc(330, 250, 20, 20, 0, -180); // mouth
       // Draw the hat
       canvas.fillRect(288, 230, 80, 4);
       canvas.fillRect(295, 193, 65, 40);
    }
}

