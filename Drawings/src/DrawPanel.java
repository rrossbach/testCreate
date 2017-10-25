import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int numPieces = 20;
        int xDistance = width / numPieces;
        int yDistance = height / numPieces;
        int n = 1;
        while (n <= numPieces) {
            g.drawLine(xDistance * n, 0, xDistance * n, height);
            g.drawLine(0, yDistance * n, width, yDistance * n);
            n = n + 1;
        }
    }
}
