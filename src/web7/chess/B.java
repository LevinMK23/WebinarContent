package web7.chess;

public class B extends A {

    public B(int a, int b, String str) {
        super(a, b, str);
        System.out.println("B created!");
    }

    public void myFunc(){
        System.out.println("Func in B class");
    }
}
