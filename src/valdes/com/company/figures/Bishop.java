package valdes.com.company.figures;

import java.awt.*;

public class Bishop extends Figure{


    Image blackBishop = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\bishop1.jpg");
    Image whiteBishop = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\bishop2.jpg");

    private int x, y;

    public Bishop(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void drawBlackBishop(Graphics2D g2d) {
        g2d.drawImage(blackBishop, x, y,55,60,null);

    }
    public void drawWhiteBishop(Graphics2D g2d) {
        g2d.drawImage(whiteBishop, x, y,55,60,null);

    }


}
