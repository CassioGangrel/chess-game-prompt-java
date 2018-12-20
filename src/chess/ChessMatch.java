package chess;

import boardlayer.Board;
import boardlayer.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
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

    private void initialSetup() {
        board.plaicePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.plaicePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.plaicePiece(new King(board, Color.WHITE), new Position(7, 4));
    }
}
