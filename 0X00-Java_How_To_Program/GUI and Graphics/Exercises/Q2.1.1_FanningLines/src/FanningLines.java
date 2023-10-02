// FanningLines.java
// This program that develops a design that draws lines from the top-left corner,
// fanning them out until they cover the upper-left half of the panel.
import javax.swing.JPanel;
import java.awt.Graphics;

public class FanningLines extends JPanel
{
    // draws lines fanning from top-left corner
    public void paintComponent(Graphics g)
    {
        // call paint component to ensure the panel displays correctly
        super.paintComponent(g);

        int width = getWidth(); // total width
        int height = getHeight(); // total height

        int linesBeingDrawn = 15;

        int xDelta = width / linesBeingDrawn; // x increment
        int yDelta = height / linesBeingDrawn; // y increment

        int x = 0;
        int y = height;

        int counter = 1;

        while (counter <= linesBeingDrawn)
        {
            g.drawLine(0, 0, x, y);
            x = x + xDelta;
            y = y - yDelta;
            counter++;
        }
    }

}
