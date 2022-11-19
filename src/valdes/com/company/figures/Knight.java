package valdes.com.company.figures;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Knight extends Figure{
    Image blackKnight = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\knight1.png");
    Image whiteKnight = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\knight3.png");

    private int x, y;

    public Knight(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void drawBlackKnight(Graphics2D g2d) {
        g2d.drawImage(blackKnight, x, y,50,60,null);

    }
    public void drawWhiteKnight(Graphics2D g2d) {
        g2d.drawImage(whiteKnight, x, y,50,60,null);

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
