package web9;

import java.math.BigInteger;
import java.util.*;

public class Div implements Comparable<Div>{

    private int a, b;

    private int gcd(int x, int y) {
        if (x == 0) return y;
        if (y == 0) return x;
        if (x > y) return gcd(x % y, y);
        else return gcd(x, y % x);
    }

    private int gcdWile(int x, int y) {
        while (x != 0 && y != 0) {
            if (x > y) x = x % y;
            if (y > x) y = y % x;
        }
        return x == 0 ? y : x;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", a, b);
    }

    public Div(int a, int b) {
        this.a = a / gcd(a, b);
        this.b = b / gcd(a, b);
    }

    public boolean checkInterval(int x1, int x2) {
        return this.compareTo(new Div(1, x1)) > 0
                && this.compareTo(new Div(1, x2)) < 0;
    }

    @Override
    public int compareTo(Div that) {
        //this - дробь объекта, к которому
        //применяют функцию
        return this.a * that.b - this.b * that.a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), p = in.nextInt(),
                q = in.nextInt();
        TreeSet<Div> divs = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                Div d = new Div(i, j);
                if (d.checkInterval(p, q)) {
                    divs.add(d);
                }
            }
        }
        for(Div div : divs){
            System.out.println(div);
        }
    }
}
