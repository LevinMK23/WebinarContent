package web7.chess;

public abstract class ChessItem {

    private int x, y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ChessItem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean check(int x, int y);

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}
