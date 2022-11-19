package valdes.com.company.figures;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.QuadCurve2D;

public class Pawn extends Figure{

    private int x, y;
    private Color color;

    public Pawn(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void drawPawn(Graphics2D g2d) {
        g2d.setColor(color);
        Path2D.Double p1 = new Path2D.Double();
        p1.moveTo(x, y);
        p1.lineTo(x+50, y);
        p1.lineTo(x +35, y -30);
        p1.lineTo(x+20,y-30);
        p1.lineTo(x,y);
        g2d.fill(p1);

        g2d.fillOval(x+15, y-50, 25,25);
    }

    @Override
    public void move() {

    }

    @Override
    public void take() {

    }

    @Override
    public void check() {
    }

    @Override
    public void checkmate() {
    }
}
