package valdes.com.company.figures;

import java.awt.*;

public class Queen extends Figure {
    @Override
    public void move() {

    }

    @Override
    public void check() {

    }

    @Override
    public void checkmate() {

    }

    @Override
    public void take() {
    }

    Image whiteQueen = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\ferz1.png");

    private int x, y;

    public Queen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawWhiteQueen(Graphics2D g2d) {
        g2d.drawImage(whiteQueen, x, y,50,60,null);

    }
}
