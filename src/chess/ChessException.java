package chess;

import boardlayer.BoardException;

public class ChessException extends BoardException {
    public static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
