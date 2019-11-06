package web7.chess;

public class Knight extends ChessItem{

    public Knight(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "KN";
    }

    @Override
    public boolean check(int x, int y) {
        return (x - getX()) * (x - getX()) +
                (y - getY()) * (y - getY()) == 5;
    }
}
