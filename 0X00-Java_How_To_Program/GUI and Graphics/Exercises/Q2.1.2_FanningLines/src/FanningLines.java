// FanningLines.java
// This program that develops a design that draws lines from the all the corners,
// fanning them out until they cover the entire panel.
import java.awt.Graphics;
import javax.swing.JPanel;

public class FanningLines extends JPanel
{
    //drawing lines
    public void paintComponent(Graphics g)
    {
        // call paint component to ensure the panel dislays correctly
        super.paintComponent(g);

        int width = getWidth(); // total width
        int height = getHeight(); // total height

        int linesBeingDrawn = 15;

        int xDelta = width / linesBeingDrawn; // x increment
        int yDelta = height / linesBeingDrawn; // y increment

        // Drawing lines from top-left corner
        // end-point of the first line
        int x = 0;
        int y = height;

        int counter = 1; // line counter

        while (counter <= linesBeingDrawn)
        {
            g.drawLine(0, 0, x, y);
            x = x + xDelta;
            y = y - yDelta;
            counter++;
        }

        // Drawing lines from top-right corner
        // end-point of the first line
        int x1 = width;
        int y1 = height;

        int counter1 = 1;

        while (counter1 <= linesBeingDrawn)
        {
            g.drawLine(width, 0, x1, y1);
            x1 = x1 - xDelta;
            y1 = y1 - yDelta;
            counter1++;
        }

        // Drawing lines from bottom-left corner
        // end-point of the first line
        int x2 = width;
        int y2 = height;

        int counter2 = 1;

        while (counter2 <= linesBeingDrawn)
        {
            g.drawLine(0, height, x2, y2);
            x2 = x2 - xDelta;
            y2 = y2 - yDelta;
            counter2++;
        }

        // Drawing Lines from bottom-right corner
        // end-point of the first line
        int x3 = 0;
        int y3 = height;

        int counter3 = 1;

        while (counter3 <= linesBeingDrawn)
        {
            g.drawLine(width, height, x3, y3);
            x3 = x3 + xDelta;
            y3 = y3 - yDelta;
            counter3++;
        }


    }
}
