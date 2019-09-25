import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Mikhail\\IdeaProjects\\WebinarContent\\src\\input.txt");
        Scanner in = new Scanner(file);
        while (in.hasNext()) {
            int x = in.nextInt();
            System.out.print(x + ": {");
            for (int i = 1; i <= x; i++) {
                if(i == x){
                    System.out.print(i + "}");
                    break;
                }
                if(x % i == 0){
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        }
    }

    private static void ansTask(int x, int y) {
        if(x * x + Math.pow(y, 2.) <= 9 &&
                x * x + y * y >= 4){
            System.out.println("Точка внутри контура");
        }
        else{
            System.out.println("Точка вне контура");
        }
    }


    static void check(int a, int b, int c, int x){
        if(x < a) {
            System.out.printf("%d ∈ (-∞; %d)\n", x, a);
        }
        else if(x < b)
            System.out.printf("%d ∈ [%d; %d)\n", x, a, b);
        else if(x < c)
            System.out.println(x + " ∈ [" + b + "; " + c + ")");
        else
            System.out.printf("%d ∈ [%d; +∞)\n", x, c);
    }
}
