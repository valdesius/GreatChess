package valdes.com.company.figures;

import java.awt.*;

public class Vizir extends Figure{
    private int x, y;

    public Vizir(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Image blackVizir = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\vb.jpg");
    Image whiteVizir = Toolkit.getDefaultToolkit().getImage("D:\\GreatChess\\src\\valdes\\com\\company\\figures\\images\\vw.jpg");

    public void drawBlackVizir(Graphics2D g2d) {
        g2d.drawImage(blackVizir, x, y,50,60,null);

    }
    public void drawWhiteVizir(Graphics2D g2d) {
        g2d.drawImage(whiteVizir, x, y,50,60,null);

    }
}
