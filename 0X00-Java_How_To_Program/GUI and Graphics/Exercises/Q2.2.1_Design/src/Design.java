// Design.java
// This class creates a design using while loops and method drawLine
import java.awt.Graphics;
import javax.swing.JPanel;

public class Design extends JPanel
{
    // Drawing the design
    public void paintComponent(Graphics g)
    {
        // calling paint component to ensure panel displays correctly
        super.paintComponent(g);

        int width = getWidth(); // total width
        int height = getHeight(); // total height

        int linesToDraw = 15;

        int xDelta = width / linesToDraw; // x increment
        int yDelta = height / linesToDraw; // y increment



        // drawing design
        // first coordinates
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


    }
}