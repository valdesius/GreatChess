package valdes.com.company.figures;

import java.awt.*;

public class Queen  extends Figure{


    Image blackQueen = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\queenblack.jpg");
    Image whiteQueen = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\queenwhite.jpg");

    private int x, y;

    public Queen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawBlackQueen(Graphics2D g2d) {
        g2d.drawImage(blackQueen, x, y,50,60,null);
    }

    public void drawWhiteQueen(Graphics2D g2d) {
        g2d.drawImage(whiteQueen, x, y,50,60,null);
    }
}
