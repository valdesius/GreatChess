package valdes.com.company.figures;

import java.awt.*;

public class King extends Figure {

    private int x, y;

    public King(int x, int y) {
        this.x = x;
        this.y = y;
    }


    Image blackKing = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\blackKing.jpg");
    Image whiteKing = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\whiteKing.jpg");

    public void drawBlackKing(Graphics2D g2d) {
        g2d.drawImage(blackKing, x, y,50,60,null);

    }
    public void drawWhiteKing(Graphics2D g2d) {
        g2d.drawImage(whiteKing, x, y,50,60,null);

    }

    public void castle() {

    }
}
