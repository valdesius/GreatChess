package valdes.com.company;

import valdes.com.company.figures.*;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {
    ChessBoard chessBoard = new ChessBoard();

    Rook rook1 = new Rook(110, 780, Color.WHITE);
    Rook rook2 = new Rook(740, 780, Color.WHITE);
    Rook rook3 = new Rook(110, 150, Color.BLACK);
    Rook rook4 = new Rook(740, 150, Color.BLACK);

    Pawn pawn1 = new Pawn(110, 720, Color.WHITE);
    Pawn pawn2 = new Pawn(180, 720, Color.WHITE);
    Pawn pawn3 = new Pawn(250, 720, Color.WHITE);
    Pawn pawn4 = new Pawn(320, 720, Color.WHITE);
    Pawn pawn5 = new Pawn(390, 720, Color.WHITE);
    Pawn pawn6 = new Pawn(460, 720, Color.WHITE);
    Pawn pawn7 = new Pawn(530, 720, Color.WHITE);
    Pawn pawn8 = new Pawn(600, 720, Color.WHITE);
    Pawn pawn9 = new Pawn(670, 720, Color.WHITE);
    Pawn pawn10 = new Pawn(740, 720, Color.WHITE);
    //
    Pawn pawn11 = new Pawn(110, 230, Color.BLACK);
    Pawn pawn12 = new Pawn(180, 230, Color.BLACK);
    Pawn pawn13 = new Pawn(250, 230, Color.BLACK);
    Pawn pawn14 = new Pawn(320, 230, Color.BLACK);
    Pawn pawn15 = new Pawn(390, 230, Color.BLACK);
    Pawn pawn16 = new Pawn(460, 230, Color.BLACK);
    Pawn pawn17 = new Pawn(530, 230, Color.BLACK);
    Pawn pawn18 = new Pawn(600, 230, Color.BLACK);
    Pawn pawn19 = new Pawn(670, 230, Color.BLACK);
    Pawn pawn20 = new Pawn(740, 230, Color.BLACK);

    Knight knight1 = new Knight(180, 110);
    Knight knight2 = new Knight(670, 110);
    Knight knight3 = new Knight(180, 740);
    Knight knight4 = new Knight(670, 740);

    Bishop bishop1 = new Bishop(250, 110);
    Bishop bishop2 = new Bishop(600, 110);
    Bishop bishop3 = new Bishop(250, 740);
    Bishop bishop4 = new Bishop(600, 740);

    Giraffe giraffe = new Giraffe(400, 740);
    Queen queen = new Queen(540, 740);


    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        chessBoard.drawChessBoard(graphics2D);
        rook1.drawRook(graphics2D);
        rook2.drawRook(graphics2D);
        rook3.drawRook(graphics2D);
        rook4.drawRook(graphics2D);
        pawn1.drawPawn(graphics2D);
        pawn2.drawPawn(graphics2D);
        pawn3.drawPawn(graphics2D);
        pawn4.drawPawn(graphics2D);
        pawn5.drawPawn(graphics2D);
        pawn6.drawPawn(graphics2D);
        pawn7.drawPawn(graphics2D);
        pawn8.drawPawn(graphics2D);
        pawn9.drawPawn(graphics2D);
        pawn10.drawPawn(graphics2D);
        pawn11.drawPawn(graphics2D);
        pawn12.drawPawn(graphics2D);
        pawn13.drawPawn(graphics2D);
        pawn14.drawPawn(graphics2D);
        pawn15.drawPawn(graphics2D);
        pawn16.drawPawn(graphics2D);
        pawn17.drawPawn(graphics2D);
        pawn18.drawPawn(graphics2D);
        pawn19.drawPawn(graphics2D);
        pawn20.drawPawn(graphics2D);
        knight1.drawBlackKnight(graphics2D);
        knight2.drawBlackKnight(graphics2D);
        knight3.drawWhiteKnight(graphics2D);
        knight4.drawWhiteKnight(graphics2D);
        bishop1.drawBlackBishop(graphics2D);
        bishop2.drawBlackBishop(graphics2D);
        bishop3.drawWhiteBishop(graphics2D);
        bishop4.drawWhiteBishop(graphics2D);
        giraffe.drawWhiteGiraffe(graphics2D);
        queen.drawWhiteQueen(graphics2D);

    }

    public Dimension getPreferredSize() {
        return new Dimension(900, 900);
    }

}
