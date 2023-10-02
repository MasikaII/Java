// Design.java
// Modifies the design of class Design to replicate the design on the four corners
import java.awt.Graphics;
import javax.swing.JPanel;

public class Design extends JPanel
{
    public void paintComponent(Graphics g)
    {
        // calling paint component to ensure panel displays correctly
        super.paintComponent(g);

        int width = getWidth(); // total width
        int height = getHeight(); // total height

        int linesToDraw = 15;

        int xDelta = width / linesToDraw; // x increment
        int yDelta = height / linesToDraw; // y increment



        // Drawing design from the top-left corner
        // First co-ordinates
        int x = xDelta;
        int y = height;
        int xOrigin = 0;
        int yOrigin = 0;

        int counter = 1;

        while (counter <= linesToDraw)
        {
            g.drawLine(xOrigin, yOrigin, x, y);
            yOrigin = yOrigin + yDelta;
            x = x + xDelta;
            counter++;
        }

        // Drawing design from bottom-right corner
        // First co-ordinates
        x = width - xDelta;
        y = 0;
        xOrigin = width;
        yOrigin = height;


        counter = 1;

        while (counter <= linesToDraw)
        {
            g.drawLine(xOrigin, yOrigin, x, y);
            yOrigin = yOrigin - yDelta;
            x = x - xDelta;
            counter++;
        }

        // Drawing design from top-right corner
        // First co-ordinates
        x = width - xDelta;
        y = height;
        xOrigin = width;
        yOrigin = 0;

        counter = 1;

        while(counter <= linesToDraw)
        {
            g.drawLine(xOrigin, yOrigin, x, y);
            yOrigin = yOrigin + yDelta;
            x = x - xDelta;
            counter++;
        }

        // Drawing design from bottom-left corner
        // First co-ordinates
        x = xDelta;
        y = 0;
        xOrigin = 0;
        yOrigin = height;

        counter = 1;

        while (counter <= linesToDraw)
        {
            g.drawLine(xOrigin, yOrigin, x, y);
            yOrigin = yOrigin - yDelta;
            x = x + xDelta;
            counter++;
        }

    }
}
