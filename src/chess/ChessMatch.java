package chess;

import boardlayer.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] match = new ChessPiece[board.getRows()][board.getColumns()];
        for (int r = 0; r < board.getRows(); r++){
            for (int c = 0; c < board.getColumns(); c++) {
                match[r][c] = (ChessPiece) board.piece(r, c);
            }

        }
        return match;
    }
}