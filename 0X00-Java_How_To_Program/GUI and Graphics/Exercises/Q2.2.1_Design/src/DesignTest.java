// Creating JFrame to display Design
import javax.swing.JFrame;

public class DesignTest
{
    public static void main(String[] args)
    {
        // create a panel that contains our fanning lines
        Design lines = new Design();

        // create a new frame to hold lines
        JFrame application = new JFrame();

        // set the frame to exit when it is closed
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(lines); // add lines to the frame
        application.setSize(250, 250); // set size of the frame
        application.setVisible(true); // make the frame visible

    }

}