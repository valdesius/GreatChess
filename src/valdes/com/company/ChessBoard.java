package valdes.com.company;

import java.awt.*;

public class ChessBoard {
    public void drawChessBoard(Graphics2D g2d) {
        g2d.setColor(new Color(0xffd98c));
        g2d.fillRect(100, 100, 70, 70);
        g2d.setColor(new Color(0xffd98c));
        g2d.fillRect(240, 100, 70, 70);

        g2d.fillRect(380, 100, 70, 70);
        g2d.fillRect(520, 100, 70, 70);
        g2d.fillRect(660, 100, 70, 70);
        //
        g2d.fillRect(170, 170, 70, 70);
        g2d.fillRect(310, 170, 70, 70);
        g2d.fillRect(450, 170, 70, 70);
        g2d.fillRect(590, 170, 70, 70);
        g2d.fillRect(730, 170, 70, 70);
        //2 ряд белых завершен
        g2d.fillRect(100, 240, 70, 70);

        g2d.fillRect(240, 240, 70, 70);

        g2d.fillRect(380, 240, 70, 70);

        g2d.fillRect(520, 240, 70, 70);
        g2d.fillRect(660, 240, 70, 70);
        //3
        g2d.fillRect(170, 310, 70, 70);
        g2d.fillRect(310, 310, 70, 70);
        g2d.fillRect(450, 310, 70, 70);
        g2d.fillRect(590, 310, 70, 70);
        g2d.fillRect(730, 310, 70, 70);

        g2d.fillRect(100, 380, 70, 70);
        g2d.fillRect(240, 380, 70, 70);
        g2d.fillRect(380, 380, 70, 70);
        g2d.fillRect(520, 380, 70, 70);
        g2d.fillRect(660, 380, 70, 70);

        g2d.fillRect(170, 450, 70, 70);
        g2d.fillRect(310, 450, 70, 70);
        g2d.fillRect(450, 450, 70, 70);
        g2d.fillRect(590, 450, 70, 70);
        g2d.fillRect(730, 450, 70, 70);

        g2d.fillRect(100, 520, 70, 70);
        g2d.fillRect(240, 520, 70, 70);
        g2d.fillRect(380, 520, 70, 70);
        g2d.fillRect(520, 520, 70, 70);
        g2d.fillRect(660, 520, 70, 70);

        g2d.fillRect(170, 590, 70, 70);
        g2d.fillRect(310, 590, 70, 70);
        g2d.fillRect(450, 590, 70, 70);
        g2d.fillRect(590, 590, 70, 70);
        g2d.fillRect(730, 590, 70, 70);

        g2d.fillRect(100, 660, 70, 70);
        g2d.fillRect(240, 660, 70, 70);
        g2d.fillRect(380, 660, 70, 70);
        g2d.fillRect(520, 660, 70, 70);
        g2d.fillRect(660, 660, 70, 70);

        g2d.fillRect(170, 730, 70, 70);
        g2d.fillRect(310, 730, 70, 70);
        g2d.fillRect(450, 730, 70, 70);
        g2d.fillRect(590, 730, 70, 70);
        g2d.fillRect(730, 730, 70, 70);

        g2d.setColor(new Color(0x804e22));
        g2d.fillRect(170, 100, 70, 70);
        g2d.fillRect(310, 100, 70, 70);
        g2d.fillRect(450, 100, 70, 70);
        g2d.fillRect(590, 100, 70, 70);
        g2d.fillRect(730, 100, 70, 70);

        g2d.fillRect(100, 170, 70, 70);
        g2d.fillRect(240, 170, 70, 70);
        g2d.fillRect(380, 170, 70, 70);
        g2d.fillRect(520, 170, 70, 70);
        g2d.fillRect(660, 170, 70, 70);

        g2d.fillRect(170, 240, 70, 70);
        g2d.fillRect(310, 240, 70, 70);
        g2d.fillRect(450, 240, 70, 70);
        g2d.fillRect(590, 240, 70, 70);
        g2d.fillRect(730, 240, 70, 70);

        g2d.fillRect(100, 310, 70, 70);
        g2d.fillRect(240, 310, 70, 70);
        g2d.fillRect(380, 310, 70, 70);
        g2d.fillRect(520, 310, 70, 70);
        g2d.fillRect(660, 310, 70, 70);

        g2d.fillRect(170, 380, 70, 70);
        g2d.fillRect(310, 380, 70, 70);
        g2d.fillRect(450, 380, 70, 70);
        g2d.fillRect(590, 380, 70, 70);
        g2d.fillRect(730, 380, 70, 70);

        g2d.fillRect(100, 450, 70, 70);
        g2d.fillRect(240, 450, 70, 70);
        g2d.fillRect(380, 450, 70, 70);
        g2d.fillRect(520, 450, 70, 70);
        g2d.fillRect(660, 450, 70, 70);

        g2d.fillRect(170, 520, 70, 70);
        g2d.fillRect(310, 520, 70, 70);
        g2d.fillRect(450, 520, 70, 70);
        g2d.fillRect(590, 520, 70, 70);
        g2d.fillRect(730, 520, 70, 70);

        g2d.fillRect(100, 590, 70, 70);
        g2d.fillRect(240, 590, 70, 70);
        g2d.fillRect(380, 590, 70, 70);
        g2d.fillRect(520, 590, 70, 70);
        g2d.fillRect(660, 590, 70, 70);

        g2d.fillRect(170, 660, 70, 70);
        g2d.fillRect(310, 660, 70, 70);
        g2d.fillRect(450, 660, 70, 70);
        g2d.fillRect(590, 660, 70, 70);
        g2d.fillRect(730, 660, 70, 70);

        g2d.fillRect(100, 730, 70, 70);
        g2d.fillRect(240, 730, 70, 70);
        g2d.fillRect(380, 730, 70, 70);
        g2d.fillRect(520, 730, 70, 70);
        g2d.fillRect(660, 730, 70, 70);
    }
}
