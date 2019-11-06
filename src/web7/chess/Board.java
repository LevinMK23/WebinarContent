package web7.chess;

public class Board {

    ChessItem [][] board;

    public Board() {
        board = new ChessItem[8][8];
        for (int i = 0; i < 8; i++) {
            board[i][1] = new Pawn(i, 1, Pawn.Colors.WHITE);
        }
        for (int i = 0; i < 8; i++) {
            board[i][6] = new Pawn(i, 6, Pawn.Colors.BLACK);
        }
        board[1][0] = new Knight(1, 0);
        board[6][0] = new Knight(6, 0);
        board[1][7] = new Knight(1, 7);
        board[6][7] = new Knight(6, 7);
    }

    public static void main(String[] args) {
        Board b = new Board();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(b.board[j][i] == null ? " _ " : b.board[j][i] + " ");
            }
            System.out.println();
        }
    }
}
