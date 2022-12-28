package valdes.com.company.figures;

import java.awt.*;

public class Giraffe extends Figure{
    Image whiteGiraffe = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\zhi.jpg");
    Image blackGiraffe = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\zhibl.jpg");


    private int x, y;

    public Giraffe(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawWhiteGiraffe(Graphics2D g2d) {
        g2d.drawImage(whiteGiraffe, x, y,50,60,null);

    }
    public void drawBlackGiraffe(Graphics2D g2d) {
        g2d.drawImage(blackGiraffe, x, y,50,60,null);

    }

}
