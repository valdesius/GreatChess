package valdes.com.company.figures;

import java.awt.*;
import java.awt.geom.Path2D;

public class Rook {
    private int x, y;
    private Color color;

    public Rook(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void drawRook(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillRect(x, y, 50, 10);

        g2d.setColor(color);
        g2d.fillRect(x + 10, y - 30, 30, 30);

        g2d.setColor(color);
        g2d.fillRect(x + 5, y - 40, 40, 10);
    }
}
