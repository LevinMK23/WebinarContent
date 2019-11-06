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

}
