package chess;

import boardlayer.Board;
import boardlayer.Piece;

public class ChessPiece extends Piece {
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color, int moveCount) {
        super(board);
        this.color = color;
        this.moveCount = moveCount;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    @Override
    public boolean[][] possibleMoves() {
        return new boolean[0][];
    }
}