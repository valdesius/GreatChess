package valdes.com.company;

import javax.swing.*;

public class ChessGame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GreatChess");

        frame.add(new DrawingPanel());
        frame.pack();
        frame.show();
    }
}
