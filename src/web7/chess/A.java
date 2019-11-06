package web7.chess;

public class A {

    protected int a, b;
    protected String str;

    public A(int a, int b, String str) {
        this.a = a;
        this.b = b;
        this.str = str;
        System.out.println("A created!");
    }

    protected void doSomeThink(){
        System.out.println(str + (a + b));
    }
}
