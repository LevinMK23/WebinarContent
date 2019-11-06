package web7.chess;



public class Pawn extends ChessItem{

    enum Colors{
        BLACK, WHITE
    }

    Colors color;

    public Pawn(int x, int y, Colors color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean check(int x, int y) {
        int x0 = getX();
        int y0 = getY();
        if(color == Colors.BLACK){
            return x == x0 && y - y0 == 1;
        }
        return x == x0 && y0 - y == 1;
    }

    @Override
    public String toString() {
        if(color == Colors.WHITE) return "WP";
        return "BP";
    }
}
